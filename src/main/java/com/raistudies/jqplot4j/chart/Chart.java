package com.raistudies.jqplot4j.chart;

import com.raistudies.jqplot4j.model.configuration.Options;
import java.util.List;

/**
 *
 * @author Rahul
 */
public class Chart {
    private Options options;
    private List<Object> chartData;

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public List<Object> getChartData() {
        return chartData;
    }

    public void setChartData(List<Object> chartData) {
        this.chartData = chartData;
    }
    
}
