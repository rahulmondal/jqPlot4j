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

package in.afterexam.jqplot4j.test.builder;

import com.raistudies.jqplot4j.builder.ChartBuilderFactory;
import com.raistudies.jqplot4j.builder.LineChartBuilder;
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
public class LineChartBuilderTest {

    @Test
    public void lineChartBuilderTest() throws IOException{
        LineChartBuilder lineChartBuilder = (LineChartBuilder) ChartBuilderFactory.get(ChartType.LINE);
        
        lineChartBuilder.getSeriesBuilder().addNewSeries();
        lineChartBuilder.getSeriesBuilder().addSeriesData(2.4);
        lineChartBuilder.getSeriesBuilder().addSeriesData(3.2);
        
        lineChartBuilder.getSeriesBuilder().addNewSeries();
        lineChartBuilder.getSeriesBuilder().addSeriesData(5.1);
        lineChartBuilder.getSeriesBuilder().addSeriesData(4.7);
        
        lineChartBuilder.addXAxesTick("Tick 1");
        lineChartBuilder.addXAxesTick("Tick 2");
        
        lineChartBuilder.setXAxisLebel("X-Axes");
        lineChartBuilder.setYAxisLebel("Y-Axis");
        lineChartBuilder.setXAxisRenderer(AxisRenderer.CategoryAxisRenderer);
        lineChartBuilder.makeSmooth();
        
        Chart chart = lineChartBuilder.build();
        
        System.out.println("Chart data json is : " + JsonUtil.convertToJson(chart.getChartData(), true));
        System.out.println("Chart option json is : " + JsonUtil.convertToJson(chart.getOptions(), true));
    }
}
