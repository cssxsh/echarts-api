package xyz.cssxsh.echarts.option

import kotlinx.serialization.*
import org.junit.jupiter.api.Test

@Suppress("EXPERIMENTAL_IS_NOT_ENABLED")
@OptIn(ExperimentalSerializationApi::class)
internal class EChartsOptionTest {
//    @Serializable
//    data class FontData(
//        val weight: FontWeight
//    )
//
//    @Test
//    fun encode() {
//        Json.encodeToString(FontData(weight = FontWeight.NORMAL))
//        Json.encodeToString(FontData(weight = FontWeight.Size(weight = 100)))
//        ProtoBuf.encodeToByteArray(FontData(weight = FontWeight.NORMAL))
//        ProtoBuf.encodeToByteArray(FontData(weight = FontWeight.Size(weight = 100)))
//    }
//
//    @Test
//    fun decode() {
//        Assertions.assertEquals(
//            Json.decodeFromString<FontData>("""{ "weight": "normal" }"""),
//            FontData(weight = FontWeight.NORMAL)
//        )
//
//        Assertions.assertEquals(
//            Json.decodeFromString<FontData>("""{ "weight": 100 }"""),
//            FontWeight.Size(weight = 100)
//        )
//    }

    @Test
    fun build() {
        val option = EChartsOptionBuilder().apply {
            title {

            }
        }.build()
    }
}