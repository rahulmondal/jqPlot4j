package com.raistudies.jqplot4j.model.configuration.series;

import com.raistudies.jqplot4j.model.configuration.series.marker.MarkerOptions;
import com.raistudies.jqplot4j.model.configuration.series.marker.MarkerRanderer;
import com.raistudies.jqplot4j.model.configuration.series.renderer.SeriesRanderer;
import com.raistudies.jqplot4j.model.configuration.series.renderer.SeriesRandererOptions;

/**
 *
 * @author Rahul
 */
public class SeriesOptions {
    private Boolean show;
    private Xaxis xaxis;
    private Yaxis yaxis;
    private String label;
    private String color;
    private Double lineWidth;
    private Boolean shadow;
    private Double shadowAngle;
    private Double shadowOffset;
    private Integer shadowDepth;
    private Double shadowAlpha;
    private Boolean showLine;
    private Boolean showMarker;
    private Boolean fill;
    private Boolean fillAndStroke;
    private String fillColor;
    private String fillAlpha;
    private SeriesRanderer randerer;
    private SeriesRandererOptions rendererOptions;
    private MarkerRanderer markerRenderer;
    private MarkerOptions markerOptions;

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public Xaxis getXaxis() {
        return xaxis;
    }

    public void setXaxis(Xaxis xaxis) {
        this.xaxis = xaxis;
    }

    public Yaxis getYaxis() {
        return yaxis;
    }

    public void setYaxis(Yaxis yaxis) {
        this.yaxis = yaxis;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(Double lineWidth) {
        this.lineWidth = lineWidth;
    }

    public Boolean getShadow() {
        return shadow;
    }

    public void setShadow(Boolean shadow) {
        this.shadow = shadow;
    }

    public Double getShadowAngle() {
        return shadowAngle;
    }

    public void setShadowAngle(Double shadowAngle) {
        this.shadowAngle = shadowAngle;
    }

    public Double getShadowOffset() {
        return shadowOffset;
    }

    public void setShadowOffset(Double shadowOffset) {
        this.shadowOffset = shadowOffset;
    }

    public Integer getShadowDepth() {
        return shadowDepth;
    }

    public void setShadowDepth(Integer shadowDepth) {
        this.shadowDepth = shadowDepth;
    }

    public Double getShadowAlpha() {
        return shadowAlpha;
    }

    public void setShadowAlpha(Double shadowAlpha) {
        this.shadowAlpha = shadowAlpha;
    }

    public Boolean getShowLine() {
        return showLine;
    }

    public void setShowLine(Boolean showLine) {
        this.showLine = showLine;
    }

    public Boolean getShowMarker() {
        return showMarker;
    }

    public void setShowMarker(Boolean showMarker) {
        this.showMarker = showMarker;
    }

    public Boolean getFill() {
        return fill;
    }

    public void setFill(Boolean fill) {
        this.fill = fill;
    }

    public Boolean getFillAndStroke() {
        return fillAndStroke;
    }

    public void setFillAndStroke(Boolean fillAndStroke) {
        this.fillAndStroke = fillAndStroke;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public String getFillAlpha() {
        return fillAlpha;
    }

    public void setFillAlpha(String fillAlpha) {
        this.fillAlpha = fillAlpha;
    }

    public SeriesRanderer getRanderer() {
        return randerer;
    }

    public void setRanderer(SeriesRanderer randerer) {
        this.randerer = randerer;
    }

    public SeriesRandererOptions getRendererOptions() {
        return rendererOptions;
    }

    public void setRendererOptions(SeriesRandererOptions rendererOptions) {
        this.rendererOptions = rendererOptions;
    }

    public MarkerRanderer getMarkerRenderer() {
        return markerRenderer;
    }

    public void setMarkerRenderer(MarkerRanderer markerRenderer) {
        this.markerRenderer = markerRenderer;
    }

    public MarkerOptions getMarkerOptions() {
        return markerOptions;
    }

    public void setMarkerOptions(MarkerOptions markerOptions) {
        this.markerOptions = markerOptions;
    }
    
    public enum Xaxis{
        xaxis, x2axis
    }
    public enum Yaxis{
        yaxis, y2axis
    }
}
