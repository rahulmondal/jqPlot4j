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

package com.raistudies.jqplot4j.model.configuration;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Rahul
 */
public class AxesOptions {
    // whether or not to render the axis.  Determined automatically.
    private Boolean show;
    // maximum numerical value of the axis.  Determined automatically.
    private Number max;
    // minimum numerical value of the axis.  Determined automatically.
    private Number min;
    // a factor multiplied by the data range on the axis to give the
    // axis range so that data points don't fall on the edges of the axis.
    private Double pad;
    // a 1D [val1, val2, ...], or 2D [[val, label], [val, label], ...]
    // array of ticks to use.  Computed automatically.
    private List<Object> ticks;
    
    private Integer numberTicks;
    
    // renderer to use to draw the axis
    private AxesRanderer randerer;
    // options to pass to the renderer.
    private Map<String, Object> rendererOptions;
    // whether or not to show the tick labels
    private Boolean showTicks;
    // whether or not to show the tick marks
    private Boolean showTickMarks;
    
    private TickOptions tickOptions;

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public Number getMax() {
        return max;
    }

    public void setMax(Number max) {
        this.max = max;
    }

    public Number getMin() {
        return min;
    }

    public void setMin(Number min) {
        this.min = min;
    }

    public Double getPad() {
        return pad;
    }

    public void setPad(Double pad) {
        this.pad = pad;
    }

    public List<Object> getTicks() {
        return ticks;
    }

    public void setTicks(List<Object> ticks) {
        this.ticks = ticks;
    }

    public Integer getNumberTicks() {
        return numberTicks;
    }

    public void setNumberTicks(Integer numberTicks) {
        this.numberTicks = numberTicks;
    }

    public AxesRanderer getRanderer() {
        return randerer;
    }

    public void setRanderer(AxesRanderer randerer) {
        this.randerer = randerer;
    }

    public Map<String, Object> getRendererOptions() {
        return rendererOptions;
    }

    public void setRendererOptions(Map<String, Object> rendererOptions) {
        this.rendererOptions = rendererOptions;
    }

    public Boolean getShowTicks() {
        return showTicks;
    }

    public void setShowTicks(Boolean showTicks) {
        this.showTicks = showTicks;
    }

    public Boolean getShowTickMarks() {
        return showTickMarks;
    }

    public void setShowTickMarks(Boolean showTickMarks) {
        this.showTickMarks = showTickMarks;
    }

    public TickOptions getTickOptions() {
        return tickOptions;
    }

    public void setTickOptions(TickOptions tickOptions) {
        this.tickOptions = tickOptions;
    }
    
}
