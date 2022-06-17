package xyz.cssxsh.echarts.option

import kotlinx.serialization.*

/**
 * [Title](https://echarts.apache.org/zh/option.html#title)
 */
@Serializable
public data class Title(
    @SerialName("id")
    val id: String? = null,
    @SerialName("show")
    val show: Boolean = true,
    @SerialName("text")
    val text: String = "",
    @SerialName("link")
    val link: String = "",
    @SerialName("target")
    val target: Target = Target.blank,
    @SerialName("textStyle")
    val textStyle: TextStyle? = null,
    @SerialName("subtext")
    val subtext: String = "",
    @SerialName("sublink")
    val sublink: String = "",
    @SerialName("subtarget")
    val subtarget: Target = Target.blank,
    @SerialName("subtextStyle")
    val subtextStyle: TextStyle? = null,
    @SerialName("textAlign")
    val textAlign: TextAlign = TextAlign.auto,
    @SerialName("textVerticalAlign")
    val textVerticalAlign: TextVerticalAlign = TextVerticalAlign.auto,
    @SerialName("triggerEvent")
    val triggerEvent: Boolean = false,
    @SerialName("padding")
    val padding: Int = 5,// TODO
    @SerialName("itemGap")
    val itemGap: Int = 10,
    @SerialName("zlevel")
    val zlevel: Int = 2,
    @SerialName("z")
    val z: Int = 2,
    @SerialName("left")
    val left: String = "auto",
    @SerialName("top")
    val top: String = "auto",
    @SerialName("right")
    val right: String = "auto",
    @SerialName("bottom")
    val bottom: String = "auto",
    @SerialName("backgroundColor")
    val backgroundColor: Color? = null,
    @SerialName("borderColor")
    val borderColor: Color? = null,
    @SerialName("borderWidth")
    val borderWidth: Int? = null,
    @SerialName("borderRadius")
    val borderRadius: Radius? = null,
    @SerialName("shadowBlur")
    val shadowBlur: Int? = null,
    @SerialName("shadowColor")
    val shadowColor: Color? = null,
    @SerialName("shadowOffsetX")
    val shadowOffsetX: Int? = null,
    @SerialName("shadowOffsetY")
    val shadowOffsetY: Int? = null
)