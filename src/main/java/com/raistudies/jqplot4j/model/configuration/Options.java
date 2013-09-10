package com.raistudies.jqplot4j.model.configuration;

import com.raistudies.jqplot4j.model.configuration.series.SeriesOptions;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Rahul
 */
public class Options {
    private List<String> seriesColors;
    private List<String> negativeSeriesColors;
    private Boolean sortData;
    private Boolean stackSeries;
    private Object title;
    private Boolean animate;
    private Boolean animateReplot;
    private Boolean captureRightClick;
    private DataRanderer dataRenderer;
    private Map<String, Object> dataRendererOptions;
    private AxesOptions axesDefaults;
    private Axes axes;
    private SeriesOptions seriesDefaults;
    private List<SeriesOptions> series;
    private LegendOptions legend;
    private NoDataIndicator noDataIndicator;

    public List<String> getSeriesColors() {
        return seriesColors;
    }

    public void setSeriesColors(List<String> seriesColors) {
        this.seriesColors = seriesColors;
    }

    public List<String> getNegativeSeriesColors() {
        return negativeSeriesColors;
    }

    public void setNegativeSeriesColors(List<String> negativeSeriesColors) {
        this.negativeSeriesColors = negativeSeriesColors;
    }

    public Boolean getSortData() {
        return sortData;
    }

    public void setSortData(Boolean sortData) {
        this.sortData = sortData;
    }

    public Boolean getStackSeries() {
        return stackSeries;
    }

    public void setStackSeries(Boolean stackSeries) {
        this.stackSeries = stackSeries;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    public Boolean getAnimate() {
        return animate;
    }

    public void setAnimate(Boolean animate) {
        this.animate = animate;
    }

    public Boolean getAnimateReplot() {
        return animateReplot;
    }

    public void setAnimateReplot(Boolean animateReplot) {
        this.animateReplot = animateReplot;
    }

    public Boolean getCaptureRightClick() {
        return captureRightClick;
    }

    public void setCaptureRightClick(Boolean captureRightClick) {
        this.captureRightClick = captureRightClick;
    }

    public DataRanderer getDataRenderer() {
        return dataRenderer;
    }

    public void setDataRenderer(DataRanderer dataRenderer) {
        this.dataRenderer = dataRenderer;
    }

    public Map<String, Object> getDataRendererOptions() {
        return dataRendererOptions;
    }

    public void setDataRendererOptions(Map<String, Object> dataRendererOptions) {
        this.dataRendererOptions = dataRendererOptions;
    }

    public AxesOptions getAxesDefaults() {
        return axesDefaults;
    }

    public void setAxesDefaults(AxesOptions axesDefaults) {
        this.axesDefaults = axesDefaults;
    }

    public Axes getAxes() {
        return axes;
    }

    public void setAxes(Axes axes) {
        this.axes = axes;
    }

    public SeriesOptions getSeriesDefaults() {
        return seriesDefaults;
    }

    public void setSeriesDefaults(SeriesOptions seriesDefaults) {
        this.seriesDefaults = seriesDefaults;
    }

    public List<SeriesOptions> getSeries() {
        return series;
    }

    public void setSeries(List<SeriesOptions> series) {
        this.series = series;
    }

    public LegendOptions getLegend() {
        return legend;
    }

    public void setLegend(LegendOptions legend) {
        this.legend = legend;
    }

    public NoDataIndicator getNoDataIndicator() {
        return noDataIndicator;
    }

    public void setNoDataIndicator(NoDataIndicator noDataIndicator) {
        this.noDataIndicator = noDataIndicator;
    }
    
    
}
