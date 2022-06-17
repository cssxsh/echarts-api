package xyz.cssxsh.echarts

import xyz.cssxsh.echarts.option.*

public interface ECharts : Cloneable {

    public var option: EChartsOption

    public fun option(block: EChartsOptionBuilder.() -> Unit) {
        option = EChartsOptionBuilder().apply(block).build()
    }

    public fun render(): ByteArray
}