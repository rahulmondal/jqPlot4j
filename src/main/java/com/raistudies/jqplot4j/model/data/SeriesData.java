package com.raistudies.jqplot4j.model.data;

import com.raistudies.jqplot4j.model.configuration.series.SeriesOptions;
import com.raistudies.jqplot4j.model.configuration.series.renderer.SeriesRanderer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rahul
 */
public class SeriesData {
    
    private List<Object> data = new ArrayList<Object>();
    private SeriesOptions seriesOptions;
    
    public List<Object> getData(){
        return data;
    }

    public void setData(List<Object> allSeriesData) {
        this.data = allSeriesData;
    }

    public SeriesOptions getSeriesOptions() {
        return seriesOptions;
    }

    public void setSeriesOptions(SeriesOptions seriesOptions) {
        this.seriesOptions = seriesOptions;
    }
    
    public void addNewSeriesData(Object seriesData){
        data.add(seriesData);
    }
    
}
