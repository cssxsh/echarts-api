package xyz.cssxsh.echarts.option

import kotlinx.serialization.*

@Serializable
public data class StateAnimation(
    @SerialName("duration")
    val duration: Int = 300,
    @SerialName("easing")
    val easing: String = "cubicOut"
)
