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

import com.raistudies.jqplot4j.chart.Chart;
import com.raistudies.jqplot4j.model.configuration.Axes;
import com.raistudies.jqplot4j.model.configuration.AxisOptions;
import com.raistudies.jqplot4j.model.configuration.AxisRenderer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rahul
 */
public abstract class AbstractChartBuilder implements ChartBuilder{
    
    protected Chart chart;
    
    protected Axes getAxes(){
        Axes axes = chart.getOptions().getAxes();
        if(axes == null){
            axes = new Axes();
            chart.getOptions().setAxes(axes);
        }
        return axes;
    }
    
    
    protected AxisOptions getXAxesOptions(){
        Axes axes = getAxes();
        AxisOptions xAxesOptions = axes.getXaxis();
        if(xAxesOptions == null){
            xAxesOptions = new AxisOptions();
            axes.setXaxis(xAxesOptions);
        }
        return xAxesOptions;
    }
    
    protected AxisOptions getYAxesOptions(){
        Axes axes = getAxes();
        AxisOptions yAxesOptions = axes.getYaxis();
        if(yAxesOptions == null){
            yAxesOptions = new AxisOptions();
            axes.setYaxis(yAxesOptions);
        }
        return yAxesOptions;
    }
    
    public void setXAxisLebel(String lebel){
        getXAxesOptions().setLabel(lebel);
    }
    
    public void setYAxisLebel(String lebel){
        getYAxesOptions().setLabel(lebel);
    }
    
    public void setXAxisRenderer(AxisRenderer axesRenderer){
        getXAxesOptions().setRenderer(axesRenderer);
    }
    
    public void setAxesRenderer(AxisRenderer axesRenderer){
        AxisOptions defaultAxesOptions = chart.getOptions().getAxesDefaults();
        if(defaultAxesOptions == null){
            defaultAxesOptions = new AxisOptions();
            chart.getOptions().setAxesDefaults(defaultAxesOptions);
        }        
        defaultAxesOptions.setRenderer(axesRenderer);
    }
    
    public void addXAxesTick(Object tickValue){
        AxisOptions xAxesOptions = getXAxesOptions();
        List<Object> xAxesTicks = xAxesOptions.getTicks();
        if(xAxesTicks == null){
            xAxesTicks = new ArrayList<Object>();
            xAxesOptions.setTicks(xAxesTicks);
        }
        xAxesTicks.add(tickValue);
    }
    
    public void addYAxesTick(Object tickValue){
        AxisOptions yAxesOptions = getYAxesOptions();
        List<Object> yAxesTicks = yAxesOptions.getTicks();
        if(yAxesTicks == null){
            yAxesTicks = new ArrayList<Object>();
            yAxesOptions.setTicks(yAxesTicks);
        }
        yAxesTicks.add(tickValue);
    }
}
