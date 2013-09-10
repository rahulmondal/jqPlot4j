package com.raistudies.jqplot4j.model.data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rahul
 */
public class PieChartData extends ChartData{
    
    public void addNewSeriesData(String level, Number value) {
        List element = new ArrayList();
        element.add(level);
        element.add(value);
        super.addNewSeriesData(element);
    }    
}
