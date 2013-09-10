package com.raistudies.jqplot4j.builder;

import com.raistudies.jqplot4j.chart.ChartType;

/**
 *
 * @author Rahul
 */
public class ChartBuilderFactory {
    public ChartBuilder get(ChartType chartType){
        switch(chartType){
            default:
                return new LineChartBuilder();
        }
    }
}
