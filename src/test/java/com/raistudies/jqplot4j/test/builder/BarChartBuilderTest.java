/*
 * Copyright 2013 @ www.raistudies.com
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

package com.raistudies.jqplot4j.test.builder;

import com.raistudies.jqplot4j.builder.BarChartBuilder;
import com.raistudies.jqplot4j.builder.ChartBuilderFactory;
import com.raistudies.jqplot4j.chart.Chart;
import com.raistudies.jqplot4j.chart.ChartType;
import com.raistudies.jqplot4j.model.configuration.AxisRenderer;
import com.raistudies.jqplot4j.util.JsonUtil;
import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Rahul
 */
public class BarChartBuilderTest {

    @Test
    public void lineChartBuilderTest() throws IOException{
        BarChartBuilder barChartBuilder = (BarChartBuilder) ChartBuilderFactory.get(ChartType.BAR);
        
        barChartBuilder.getSeriesBuilder().addNewSeries();
        barChartBuilder.getSeriesBuilder().addSeriesData(2.4);
        barChartBuilder.getSeriesBuilder().addSeriesData(3.2);
        barChartBuilder.getSeriesBuilder().addSeriesData(5.9);
        
        barChartBuilder.getSeriesBuilder().addNewSeries();
        barChartBuilder.getSeriesBuilder().addSeriesData(5.1);
        barChartBuilder.getSeriesBuilder().addSeriesData(4.7);
        barChartBuilder.getSeriesBuilder().addSeriesData(5.4);
        
        barChartBuilder.addXAxesTick("Tick 1");
        barChartBuilder.addXAxesTick("Tick 2");
        barChartBuilder.addXAxesTick("Tick 3");
        
        barChartBuilder.setXAxisLebel("X-Axes");
        barChartBuilder.setYAxisLebel("Y-Axis");
        barChartBuilder.setYAxisValueFormat("%#.2f");
        barChartBuilder.setXAxisRenderer(AxisRenderer.CategoryAxisRenderer);
        barChartBuilder.animate(true);
        
        Chart chart = barChartBuilder.build();
        
        System.out.println("Chart data json is : " + JsonUtil.convertToJson(chart.getChartData(), true));
        System.out.println("Chart option json is : " + JsonUtil.convertToJson(chart.getOptions(), true));
    }
}
