package xyz.cssxsh.echarts.option

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * [TextStyle](https://echarts.apache.org/zh/option.html#textStyle)
 */
@Serializable
public data class TextStyle(
    @SerialName("color")
    val color: JsonElement? = null,
    @SerialName("fontStyle")
    val fontStyle: FontStyle = FontStyle.normal,
    @SerialName("fontWeight")
    val fontWeight: FontWeight = FontWeight.NORMAL,
    @SerialName("fontFamily")
    val fontFamily: String = "sans-serif",
    @SerialName("fontSize")
    val fontSize : Int = 12,
    @SerialName("lineHeight")
    val lineHeight : Int? = null,
    @SerialName("width")
    val width : Int? = null,
    @SerialName("height")
    val height : Int? = null,
    @SerialName("textBorderColor")
    val textBorderColor : Color? = null,
    @SerialName("textBorderWidth")
    val textBorderWidth : Int? = null,
    @SerialName("textBorderType")
    val textBorderType: TextBorderType = TextBorderType.SOLID,
    @SerialName("textBorderDashOffset")
    val textBorderDashOffset: Int? = null,
    @SerialName("textShadowColor")
    val textShadowColor: Color = Color.TRANSPARENT,
    @SerialName("textShadowBlur")
    val textShadowBlur: Int = 0,
    @SerialName("textShadowOffsetX")
    val textShadowOffsetX: Int = 0,
    @SerialName("textShadowOffsetY")
    val textShadowOffsetY: Int = 0,
    @SerialName("overflow")
    val overflow: Overflow = Overflow.none,
    @SerialName("ellipsis")
    val ellipsis: String = "...",
)
