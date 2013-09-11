/*
 * Copyright 2013 @ www.raistudies.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.raistudies.jqplot4j.model.configuration;

import com.raistudies.jqplot4j.model.configuration.series.SeriesOptions;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonRawValue;

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
    @JsonRawValue
    private DataRenderer dataRenderer;
    private Map<String, Object> dataRendererOptions;
    private AxisOptions axesDefaults;
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

    public DataRenderer getDataRenderer() {
        return dataRenderer;
    }

    public void setDataRenderer(DataRenderer dataRenderer) {
        this.dataRenderer = dataRenderer;
    }

    public Map<String, Object> getDataRendererOptions() {
        return dataRendererOptions;
    }

    public void setDataRendererOptions(Map<String, Object> dataRendererOptions) {
        this.dataRendererOptions = dataRendererOptions;
    }

    public AxisOptions getAxesDefaults() {
        return axesDefaults;
    }

    public void setAxesDefaults(AxisOptions axesDefaults) {
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
