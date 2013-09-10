package com.raistudies.jqplot4j.model.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Rahul
 */
public class HBarChartData extends ChartData{
    private List<String> yAxisValues;
    private Map<String, List<Number>> xAxisValues;
    private int maxXAxisCount = 0;
    
    public void addYAxisValue(String yAxisValue, List<Number> xAxisValues){
        this.yAxisValues.add(yAxisValue);
        if(xAxisValues == null){
            this.xAxisValues.put(yAxisValue, new ArrayList<Number>());
            
        } else {
            this.xAxisValues.put(yAxisValue, xAxisValues);
        }
    }
    
    public void addXValue(String yAxisValue, Number xAxisValue){
        if(this.xAxisValues.get(yAxisValue) == null){
            this.yAxisValues.add(yAxisValue);
            this.xAxisValues.put(yAxisValue, new ArrayList<Number>());
        }
        this.xAxisValues.get(yAxisValue).add(xAxisValue);
    }
    
    public void addXValues(String yAxisValue, List<Number> xAxisValue){
        if(this.xAxisValues.get(yAxisValue) == null){
            this.yAxisValues.add(yAxisValue);
            this.xAxisValues.put(yAxisValue, xAxisValue);
        }
        this.xAxisValues.get(yAxisValue).addAll(xAxisValue);
    }

    @Override
    public List<Object> getData() {
        normalizeData();
        for (int i = 0; i < maxXAxisCount; i++) {
            List<List<Object>> series = new ArrayList<List<Object>>();
            addNewSeriesData(series);
            int count = 0;
            for (Map.Entry<String, List<Number>> entry : xAxisValues.entrySet()) {
                series.add(new ArrayList<Object>());
                series.get(count).add(entry.getKey());
                series.get(count).add(entry.getValue().get(i));
            }
        }
        return super.getData();
    }   
    
    private void normalizeData(){
        for(List<Number> xAxisValue : this.xAxisValues.values()){
            if(maxXAxisCount < xAxisValue.size()){
                maxXAxisCount = xAxisValue.size();
            }
        }
        
        for(List<Number> xAxisValue : this.xAxisValues.values()){
            while(xAxisValue.size() != maxXAxisCount){
                xAxisValue.add(0.0d);
            }
        }
    }
}
