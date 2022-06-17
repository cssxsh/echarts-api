package xyz.cssxsh.echarts.option

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

@Serializable(with = FontWeight.Serializer::class)
public sealed class FontWeight {
    @Serializable(with = Type.Companion::class)
    public data class Type(val name: String) : FontWeight() {
        public companion object : KSerializer<Type> {
            override val descriptor: SerialDescriptor =
                PrimitiveSerialDescriptor(Type::class.qualifiedName!!, PrimitiveKind.STRING)

            override fun serialize(encoder: Encoder, value: Type): Unit = encoder.encodeString(value = value.name)

            override fun deserialize(decoder: Decoder): Type = Type(name = decoder.decodeString())
        }
    }

    @Serializable(with = Size.Companion::class)
    public data class Size(val weight: Int) : FontWeight() {
        public companion object : KSerializer<Size> {
            override val descriptor: SerialDescriptor =
                PrimitiveSerialDescriptor(Size::class.qualifiedName!!, PrimitiveKind.INT)

            override fun serialize(encoder: Encoder, value: Size): Unit = encoder.encodeInt(value = value.weight)

            override fun deserialize(decoder: Decoder): Size = Size(weight = decoder.decodeInt())
        }
    }

    public companion object Serializer : JsonContentPolymorphicSerializer<FontWeight>(FontWeight::class) {
        override fun selectDeserializer(element: JsonElement): DeserializationStrategy<out FontWeight> {
            return when {
                element.jsonPrimitive.isString -> Type.serializer()
                else -> Size.serializer()
            }
        }

        public val NORMAL: FontWeight = Type(name = "normal")
        public val BOLD: FontWeight = Type(name = "bold")
        public val BOLDER: FontWeight = Type(name = "bolder")
        public val LIGHTER: FontWeight = Type(name = "lighter")
    }
}