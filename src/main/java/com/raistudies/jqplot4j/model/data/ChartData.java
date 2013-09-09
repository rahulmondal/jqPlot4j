package com.raistudies.jqplot4j.model.data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rahul
 */
public class ChartData {
    
    private List<Object> allSeriesData = new ArrayList<Object>();
    
    public List<Object> getData(){
        return allSeriesData;
    }
    
    public void addNewSeriesData(Object seriesData){
        allSeriesData.add(seriesData);
    }
    
}
