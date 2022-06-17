package xyz.cssxsh.echarts.option

import kotlinx.serialization.SerialName

public class EChartsOptionBuilder {
    public var blendMode: String = "'source-over"
    public var hoverLayerThreshold: Int = 3_000
    public var useUTC: Boolean = false
    public var options: List<EChartsOption>? = null
    public var media: List<Media>? = null

    // region Title
    private var title: TitleBuilder? = null

    @EChartsOptionDsl
    public fun title(block: TitleBuilder.() -> Unit) {
        title = (title ?: TitleBuilder()).apply(block)
    }
    // endregion

    // region Legend
    public var legend: String? = null

    @EChartsOptionDsl
    public fun legend() {}

    // endregion

    // region Grid
    public var grid: String? = null

    @EChartsOptionDsl
    public fun grid() {}

    // endregion

    // region Axis
    public var xAxis: String? = null
    public var yAxis: String? = null
    public var polar: String? = null
    public var radiusAxis: String? = null
    public var angleAxis: String? = null
    public var radar: String? = null

    // endregion

    // region Animation
    public var animationEasingUpdate: String = "0"
    public var animationDelayUpdate: Int = 0
    public var stateAnimation: StateAnimation = StateAnimation()

    // endregion

    public fun build(): EChartsOption {
        return EChartsOption(
            title = title?.build(),
            animationEasingUpdate = animationEasingUpdate,
            animationDelayUpdate = animationDelayUpdate,
            stateAnimation = stateAnimation,
            blendMode = blendMode,
            hoverLayerThreshold = hoverLayerThreshold,
            useUTC = useUTC,
            options = options,
            media = media
        )
    }
}