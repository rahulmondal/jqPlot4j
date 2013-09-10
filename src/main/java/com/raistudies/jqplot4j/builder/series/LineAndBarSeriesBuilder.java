package com.raistudies.jqplot4j.builder.series;

import com.raistudies.jqplot4j.chart.ChartType;
import com.raistudies.jqplot4j.model.data.SeriesData;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rahul
 */
public class LineAndBarSeriesBuilder extends AbstractSeriesBuilder {
    
    private ChartType chartType;

    public LineAndBarSeriesBuilder(ChartType chartType) {
        this.chartType = chartType;
    }
    
    public LineAndBarSeriesBuilder addNewSeries(){
        chartData.getData().add(new ArrayList<Number>());
        return this;
    }
    
    public LineAndBarSeriesBuilder addNewSeries(List<Number> seriesdata){
        chartData.getData().add(seriesdata);
        return this;
    }
    
    public LineAndBarSeriesBuilder addSeriesData(Number value){
        List<Object> allSeriesData = chartData.getData();
        assert allSeriesData.isEmpty() == false;
        ((ArrayList<Number>)allSeriesData.get(allSeriesData.size() - 1)).add(value);
        return this;
    }

    public SeriesData build() {
        return chartData;
    }
    
}
