package com.raistudies.jqplot4j.model.configuration.series.renderer;

import java.util.List;

/**
 *
 * @author Rahul
 */
public class BarChartRendererOptions extends SeriesRandererOptions {
    private Integer barPadding;
    private Integer barMargin;
    private BarDirection barDirection;
    private Integer barWidth;
    private Integer shadowOffset;
    private Integer shadowDepth;
    private Integer shadowAlpha;
    private Boolean waterfall;
    private Integer groups;
    private Boolean varyBarColor;
    private Boolean highlightMouseOver;
    private Boolean highlightMouseDown;
    private Boolean fill;
    private List<String> highlightColors;

    public Integer getBarPadding() {
        return barPadding;
    }

    public void setBarPadding(Integer barPadding) {
        this.barPadding = barPadding;
    }

    public Integer getBarMargin() {
        return barMargin;
    }

    public void setBarMargin(Integer barMargin) {
        this.barMargin = barMargin;
    }

    public BarDirection getBarDirection() {
        return barDirection;
    }

    public void setBarDirection(BarDirection barDirection) {
        this.barDirection = barDirection;
    }

    public Integer getBarWidth() {
        return barWidth;
    }

    public void setBarWidth(Integer barWidth) {
        this.barWidth = barWidth;
    }

    public Integer getShadowOffset() {
        return shadowOffset;
    }

    public void setShadowOffset(Integer shadowOffset) {
        this.shadowOffset = shadowOffset;
    }

    public Integer getShadowDepth() {
        return shadowDepth;
    }

    public void setShadowDepth(Integer shadowDepth) {
        this.shadowDepth = shadowDepth;
    }

    public Integer getShadowAlpha() {
        return shadowAlpha;
    }

    public void setShadowAlpha(Integer shadowAlpha) {
        this.shadowAlpha = shadowAlpha;
    }

    public Boolean getWaterfall() {
        return waterfall;
    }

    public void setWaterfall(Boolean waterfall) {
        this.waterfall = waterfall;
    }

    public Integer getGroups() {
        return groups;
    }

    public void setGroups(Integer groups) {
        this.groups = groups;
    }

    public Boolean getVaryBarColor() {
        return varyBarColor;
    }

    public void setVaryBarColor(Boolean varyBarColor) {
        this.varyBarColor = varyBarColor;
    }

    public Boolean getHighlightMouseOver() {
        return highlightMouseOver;
    }

    public void setHighlightMouseOver(Boolean highlightMouseOver) {
        this.highlightMouseOver = highlightMouseOver;
    }

    public Boolean getHighlightMouseDown() {
        return highlightMouseDown;
    }

    public void setHighlightMouseDown(Boolean highlightMouseDown) {
        this.highlightMouseDown = highlightMouseDown;
    }

    public Boolean getFill() {
        return fill;
    }

    public void setFill(Boolean fill) {
        this.fill = fill;
    }

    public List<String> getHighlightColors() {
        return highlightColors;
    }

    public void setHighlightColors(List<String> highlightColors) {
        this.highlightColors = highlightColors;
    }
    
}
