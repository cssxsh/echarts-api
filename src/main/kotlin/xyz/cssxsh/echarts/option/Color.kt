package xyz.cssxsh.echarts.option

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

@Serializable(with = Color.Serializer::class)
public sealed class Color {
    @Serializable(with = Code.Companion::class)
    public data class Code(val text: String) : Color() {
        override fun toString(): String = text

        public companion object : KSerializer<Code> {
            override val descriptor: SerialDescriptor =
                PrimitiveSerialDescriptor("Code", PrimitiveKind.STRING)

            override fun serialize(encoder: Encoder, value: Code) {
                encoder.encodeString(value = value.text)
            }

            override fun deserialize(decoder: Decoder): Code {
                return Code(text = decoder.decodeString())
            }
        }
    }

    @Serializable
    @SerialName("linear")
    public data class Linear(
        @SerialName("type")
        val type: String,
        @SerialName("x")
        val x: Double,
        @SerialName("y")
        val y: Double,
        @SerialName("x2")
        val x2: Double,
        @SerialName("y2")
        val y2: Double,
        @SerialName("colorStops")
        val colorStops: List<Stop> = emptyList(),
        @SerialName("global")
        val global: Boolean = false
    ) : Color()

    @Serializable
    @SerialName("radial")
    public data class Radial(
        @SerialName("type")
        val type: String,
        @SerialName("x")
        val x: Double,
        @SerialName("y")
        val y: Double,
        @SerialName("r")
        val r: Double,
        @SerialName("colorStops")
        val colorStops: List<Stop> = emptyList(),
        @SerialName("global")
        val global: Boolean = false
    ) : Color()

    @Serializable
    @SerialName("image")
    public data class Image(
        @SerialName("image")
        val image: String,
        // 'repeat, repeat-x', 'repeat-y', 'no-repeat'
        @SerialName("repeat")
        val repeat: String,
    ) : Color()

    @Serializable
    public data class Stop(val offset: Double, val color: Color)

    public companion object Serializer : JsonContentPolymorphicSerializer<Color>(Color::class) {
        override fun selectDeserializer(element: JsonElement): DeserializationStrategy<out Color> {
            return when (element) {
                is JsonPrimitive -> Code.serializer()
                is JsonObject -> when (element["type"]?.jsonPrimitive?.content) {
                    "linear" -> Linear.serializer()
                    "radial" -> Radial.serializer()
                    else -> Image.serializer()
                }
                else -> throw IllegalArgumentException("$element")
            }
        }

        public val RED: Color = Code(text = "red")
        public val TRANSPARENT: Color = Code(text = "transparent")

        public fun rgb(red: Int, green: Int, blue: Int): Color {
            return Code(text = "rgb($red, $green, $blue)")
        }

        public fun rgba(red: Int, green: Int, blue: Int, alpha: Double): Color {
            return Code(text = "rgba($red, $green, $blue, $alpha)")
        }
    }
}
