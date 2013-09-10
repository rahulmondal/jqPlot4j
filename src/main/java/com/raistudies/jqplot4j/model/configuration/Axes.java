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
    private AxesOptions xaxis;
    private AxesOptions yaxis;
    private AxesOptions x2axis;
    private AxesOptions y2axis;

    public AxesOptions getXaxis() {
        return xaxis;
    }

    public void setXaxis(AxesOptions xaxis) {
        this.xaxis = xaxis;
    }

    public AxesOptions getYaxis() {
        return yaxis;
    }

    public void setYaxis(AxesOptions yaxis) {
        this.yaxis = yaxis;
    }

    public AxesOptions getX2axis() {
        return x2axis;
    }

    public void setX2axis(AxesOptions x2axis) {
        this.x2axis = x2axis;
    }

    public AxesOptions getY2axis() {
        return y2axis;
    }

    public void setY2axis(AxesOptions y2axis) {
        this.y2axis = y2axis;
    }
    
}
