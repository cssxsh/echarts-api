package xyz.cssxsh.echarts.option

import kotlinx.serialization.*

/**
 * [Option](https://echarts.apache.org/zh/option.html)
 */
@Serializable
public data class EChartsOption(
    @SerialName("title")
    val title: Title?,
    @SerialName("animationEasingUpdate")
    val animationEasingUpdate: String,
    @SerialName("animationDelayUpdate")
    val animationDelayUpdate: Int,
    @SerialName("stateAnimation")
    val stateAnimation: StateAnimation,
    @SerialName("blendMode")
    val blendMode: String, // TODO
    @SerialName("hoverLayerThreshold")
    val hoverLayerThreshold: Int,
    @SerialName("useUTC")
    val useUTC: Boolean,
    @SerialName("options")
    val options: List<EChartsOption>?,
    @SerialName("media")
    val media: List<Media>?,
)