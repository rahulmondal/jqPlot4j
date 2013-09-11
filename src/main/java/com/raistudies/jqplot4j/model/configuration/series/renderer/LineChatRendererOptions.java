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

package com.raistudies.jqplot4j.model.configuration.series.renderer;

/**
 *
 * @author Rahul
 */
public class LineChatRendererOptions  extends SeriesRendererOptions {
    private Boolean smooth;
    private Boolean constrainSmoothing;
    private Double tension;

    public Boolean getSmooth() {
        return smooth;
    }

    public void setSmooth(Boolean smooth) {
        this.smooth = smooth;
    }

    public Boolean getConstrainSmoothing() {
        return constrainSmoothing;
    }

    public void setConstrainSmoothing(Boolean constrainSmoothing) {
        this.constrainSmoothing = constrainSmoothing;
    }

    public Double getTension() {
        return tension;
    }

    public void setTension(Double tension) {
        this.tension = tension;
    }
    
}
