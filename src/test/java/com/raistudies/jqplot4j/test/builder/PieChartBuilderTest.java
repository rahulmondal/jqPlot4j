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

import com.raistudies.jqplot4j.builder.ChartBuilderFactory;
import com.raistudies.jqplot4j.builder.PieChartBuilder;
import com.raistudies.jqplot4j.chart.Chart;
import com.raistudies.jqplot4j.chart.ChartType;
import com.raistudies.jqplot4j.util.JsonUtil;
import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Rahul
 */
public class PieChartBuilderTest {
    @Test
    public void test_pieChartBuilder() throws IOException{
        PieChartBuilder pieChartBuilder = (PieChartBuilder) ChartBuilderFactory.get(ChartType.PIE);
        
        pieChartBuilder.getSeriesBuilder().addNewSeriesData("TCS", 34).addNewSeriesData("Infosys", 21).addNewSeriesData("Tech. M.", 12);
        
        pieChartBuilder.animate(true);
        
        Chart chart = pieChartBuilder.build();
        
        System.out.println("Chart data json is : " + JsonUtil.convertToJson(chart.getChartData(), true));
        System.out.println("Chart option json is : " + JsonUtil.convertToJson(chart.getOptions(), true));
    }
}
