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

/**
 *
 * @author Rahul
 */
public class Axes {
    private AxisOptions xaxis;
    private AxisOptions yaxis;
    private AxisOptions x2axis;
    private AxisOptions y2axis;

    public AxisOptions getXaxis() {
        return xaxis;
    }

    public void setXaxis(AxisOptions xaxis) {
        this.xaxis = xaxis;
    }

    public AxisOptions getYaxis() {
        return yaxis;
    }

    public void setYaxis(AxisOptions yaxis) {
        this.yaxis = yaxis;
    }

    public AxisOptions getX2axis() {
        return x2axis;
    }

    public void setX2axis(AxisOptions x2axis) {
        this.x2axis = x2axis;
    }

    public AxisOptions getY2axis() {
        return y2axis;
    }

    public void setY2axis(AxisOptions y2axis) {
        this.y2axis = y2axis;
    }
    
}
