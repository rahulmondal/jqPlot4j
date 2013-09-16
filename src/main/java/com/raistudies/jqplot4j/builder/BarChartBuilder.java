/*
 * Copyright 2013 Rahul.
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
package com.raistudies.jqplot4j.builder;

import com.raistudies.jqplot4j.builder.series.BarSeriesBuilder;
import com.raistudies.jqplot4j.chart.Chart;
import com.raistudies.jqplot4j.model.data.SeriesData;

/**
 *
 * @author Rahul
 */
public class BarChartBuilder extends AbstractChartBuilder implements ChartBuilder {
    
    private BarSeriesBuilder seriesBuilder;

    public BarChartBuilder() {
        super();
        seriesBuilder = new BarSeriesBuilder();
    }
    

    public Chart build() {
        SeriesData seriesData = seriesBuilder.build();
        chart.setChartData(seriesData.getData());
        chart.getOptions().setSeriesDefaults(seriesData.getSeriesOptions());
        return chart;
    }

    public BarSeriesBuilder getSeriesBuilder() {
        return seriesBuilder;
    }
    
}
