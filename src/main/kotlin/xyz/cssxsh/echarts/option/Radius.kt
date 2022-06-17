package xyz.cssxsh.echarts.option

import kotlinx.serialization.*

@Serializable
public sealed class Radius {
    public data class Single(val size: Int): Radius()
}
