/*
 * Copyright 2013 @ www.raistudies.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.raistudies.jqplot4j.builder.series;

import com.raistudies.jqplot4j.chart.ChartType;
import com.raistudies.jqplot4j.model.data.SeriesData;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rahul
 */
public class SimpleSeriesBuilder extends AbstractSeriesBuilder {
    
    private ChartType chartType;

    public SimpleSeriesBuilder(ChartType chartType) {
        this.chartType = chartType;
    }
    
    public SimpleSeriesBuilder addNewSeries(){
        chartData.getData().add(new ArrayList<Number>());
        return this;
    }
    
    public SimpleSeriesBuilder addNewSeries(List<Number> seriesdata){
        chartData.getData().add(seriesdata);
        return this;
    }
    
    public SimpleSeriesBuilder addSeriesData(Number value){
        List<Object> allSeriesData = chartData.getData();
        assert allSeriesData.isEmpty() == false;
        ((ArrayList<Number>)allSeriesData.get(allSeriesData.size() - 1)).add(value);
        return this;
    }
    
    public SeriesData build() {
        return chartData;
    }
    
}
