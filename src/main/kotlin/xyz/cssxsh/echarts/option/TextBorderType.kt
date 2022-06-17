package xyz.cssxsh.echarts.option

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

@Serializable(with = TextBorderType.Serializer::class)
public sealed class TextBorderType {
    @Serializable(with = Text.Companion::class)
    public data class Text(val name: String) : TextBorderType() {
        public companion object : KSerializer<Text> {
            override val descriptor: SerialDescriptor =
                PrimitiveSerialDescriptor(TextBorderType::class.qualifiedName!!, PrimitiveKind.STRING)

            override fun serialize(encoder: Encoder, value: Text): Unit = encoder.encodeString(value = value.name)

            override fun deserialize(decoder: Decoder): Text = Text(name = decoder.decodeString())
        }
    }

    public companion object Serializer : JsonContentPolymorphicSerializer<TextBorderType>(TextBorderType::class) {
        override fun selectDeserializer(element: JsonElement): DeserializationStrategy<out TextBorderType> {
            return when (element) {
                is JsonPrimitive -> {
                    if (element.isString) {
                        Text.serializer()
                    } else {
                        TODO()
                    }
                }
                is JsonArray -> TODO()
                else -> throw IllegalArgumentException("$element")
            }
        }

        public val SOLID: TextBorderType = Text(name = "solid")
        public val DASHED: TextBorderType = Text(name = "dashed")
        public val DOTTED: TextBorderType = Text(name = "dotted")
    }
}
