package com.raistudies.jqplot4j.model.data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rahul
 */
public class LineChartData extends ChartData {

    public void addNewSeries(){
        getData().add(new ArrayList<Number>());
    }
    
    public void addNewSeries(List<Number> seriesdata){
        getData().add(seriesdata);
    }
    
    public void addSeriesData(Number value){
        List<Object> allSeriesData = getData();
        assert allSeriesData.isEmpty() == false;
        ((ArrayList<Number>)allSeriesData.get(allSeriesData.size() - 1)).add(value);
    }
}
