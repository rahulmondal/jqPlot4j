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

package com.raistudies.jqplot4j.builder;

import com.raistudies.jqplot4j.builder.series.LineAndBarSeriesBuilder;
import com.raistudies.jqplot4j.chart.Chart;
import com.raistudies.jqplot4j.chart.ChartType;
import com.raistudies.jqplot4j.model.configuration.Options;
import com.raistudies.jqplot4j.model.data.SeriesData;

/**
 *
 * @author Rahul
 */
public class LineChartBuilder extends AbstractChartBuilder implements ChartBuilder{
    
    private LineAndBarSeriesBuilder seriesBuilder;

    public LineChartBuilder() {
        chart = new Chart();
        chart.setOptions(new Options());
        seriesBuilder = new LineAndBarSeriesBuilder(ChartType.LINE);
    }
    
    public Chart build() {
        SeriesData seriesData = seriesBuilder.build();
        chart.setChartData(seriesData.getData());
        chart.getOptions().setSeriesDefaults(seriesData.getSeriesOptions());
        return chart;
    }
}
