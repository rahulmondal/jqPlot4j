package com.raistudies.jqplot4j.builder;

import com.raistudies.jqplot4j.builder.series.LineAndBarSeriesBuilder;
import com.raistudies.jqplot4j.chart.Chart;
import com.raistudies.jqplot4j.chart.ChartType;
import com.raistudies.jqplot4j.model.configuration.Options;
import com.raistudies.jqplot4j.model.data.SeriesData;

/**
 *
 * @author Rahul
 */
public class LineChartBuilder extends AbstractChartBuilder implements ChartBuilder{
    
    private LineAndBarSeriesBuilder seriesBuilder;

    public LineChartBuilder() {
        chart = new Chart();
        chart.setOptions(new Options());
        seriesBuilder = new LineAndBarSeriesBuilder(ChartType.LINE);
    }
    
    public Chart build() {
        SeriesData seriesData = seriesBuilder.build();
        chart.setChartData(seriesData.getData());
        chart.getOptions().setSeriesDefaults(seriesData.getSeriesOptions());
        return chart;
    }
}
