package com.raistudies.jqplot4j.builder.series;

import com.raistudies.jqplot4j.model.data.SeriesData;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rahul
 */
public class PieSeriesBuilder extends AbstractSeriesBuilder {
    
    public PieSeriesBuilder addNewSeriesData(String level, Number value) {
        List element = new ArrayList();
        element.add(level);
        element.add(value);
        chartData.addNewSeriesData(element);
        return this;
    }
    
    public SeriesData build(){
        return chartData;
    }
}
