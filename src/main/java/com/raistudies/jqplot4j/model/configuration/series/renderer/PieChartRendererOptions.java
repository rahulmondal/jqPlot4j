package com.raistudies.jqplot4j.model.configuration.series.renderer;

import java.util.List;

/**
 *
 * @author Rahul
 */
public class PieChartRendererOptions {

    private Number diameter;
    private Integer padding;
    private Integer sliceMargin;
    private Boolean fill;
    private Integer shadowOffset;
    private Double shadowAlpha;
    private Integer shadowDepth;
    private Boolean highlightMouseOver;
    private Boolean highlightMouseDown;
    private List<String> highlightColors;
    private PieDataLevel dataLabels;
    private Boolean showDataLabels;
    // Format string for data labels.  If none, '%s' is used for "label" and for arrays, '%d' for value and '%d%%' for percentage.
    private String dataLabelFormatString;
    // Threshhold in percentage (0-100) of pie area, below which no label will be displayed.
    // This applies to all label types, not just to percentage labels.
    private Integer dataLabelThreshold;
    // A Multiplier (0-1) of the pie radius which controls position of label on slice.
    // Increasing will slide label toward edge of pie, decreasing will slide label toward center of pie.
    private Double dataLabelPositionFactor;
    // Number of pixels to slide the label away from (+) or toward (-) the center of the pie.
    private Integer dataLabelNudge;
    // True to center the data label at its position.
    // False to set the inside facing edge of the label at its position.
    private Boolean dataLabelCenterOn;
    // Angle to start drawing pie in degrees.  
    // According to orientation of canvas coordinate system:
    // 0 = on the positive x axis
    // -90 = on the positive y axis.
    // 90 = on the negaive y axis.
    // 180 or - 180 = on the negative x axis.
    private Integer startAngle;

    public Number getDiameter() {
        return diameter;
    }

    public void setDiameter(Number diameter) {
        this.diameter = diameter;
    }

    public Integer getPadding() {
        return padding;
    }

    public void setPadding(Integer padding) {
        this.padding = padding;
    }

    public Integer getSliceMargin() {
        return sliceMargin;
    }

    public void setSliceMargin(Integer sliceMargin) {
        this.sliceMargin = sliceMargin;
    }

    public Boolean getFill() {
        return fill;
    }

    public void setFill(Boolean fill) {
        this.fill = fill;
    }

    public Integer getShadowOffset() {
        return shadowOffset;
    }

    public void setShadowOffset(Integer shadowOffset) {
        this.shadowOffset = shadowOffset;
    }

    public Double getShadowAlpha() {
        return shadowAlpha;
    }

    public void setShadowAlpha(Double shadowAlpha) {
        this.shadowAlpha = shadowAlpha;
    }

    public Integer getShadowDepth() {
        return shadowDepth;
    }

    public void setShadowDepth(Integer shadowDepth) {
        this.shadowDepth = shadowDepth;
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

    public List<String> getHighlightColors() {
        return highlightColors;
    }

    public void setHighlightColors(List<String> highlightColors) {
        this.highlightColors = highlightColors;
    }

    public PieDataLevel getDataLabels() {
        return dataLabels;
    }

    public void setDataLabels(PieDataLevel dataLabels) {
        this.dataLabels = dataLabels;
    }

    public Boolean getShowDataLabels() {
        return showDataLabels;
    }

    public void setShowDataLabels(Boolean showDataLabels) {
        this.showDataLabels = showDataLabels;
    }

    public String getDataLabelFormatString() {
        return dataLabelFormatString;
    }

    public void setDataLabelFormatString(String dataLabelFormatString) {
        this.dataLabelFormatString = dataLabelFormatString;
    }

    public Integer getDataLabelThreshold() {
        return dataLabelThreshold;
    }

    public void setDataLabelThreshold(Integer dataLabelThreshold) {
        this.dataLabelThreshold = dataLabelThreshold;
    }

    public Double getDataLabelPositionFactor() {
        return dataLabelPositionFactor;
    }

    public void setDataLabelPositionFactor(Double dataLabelPositionFactor) {
        this.dataLabelPositionFactor = dataLabelPositionFactor;
    }

    public Integer getDataLabelNudge() {
        return dataLabelNudge;
    }

    public void setDataLabelNudge(Integer dataLabelNudge) {
        this.dataLabelNudge = dataLabelNudge;
    }

    public Boolean getDataLabelCenterOn() {
        return dataLabelCenterOn;
    }

    public void setDataLabelCenterOn(Boolean dataLabelCenterOn) {
        this.dataLabelCenterOn = dataLabelCenterOn;
    }

    public Integer getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(Integer startAngle) {
        this.startAngle = startAngle;
    }

}
