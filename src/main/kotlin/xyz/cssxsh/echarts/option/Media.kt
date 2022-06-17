package xyz.cssxsh.echarts.option

import kotlinx.serialization.*

@Serializable
public data class Media(
    @SerialName("query")
    val query: Map<String, String>,
    @SerialName("option")
    val option: EChartsOption
)
