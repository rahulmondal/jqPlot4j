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
public class LegendOptions {
    private Boolean show;
    private String location;
    private Integer xoffset;
    private Integer yoffset;

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getXoffset() {
        return xoffset;
    }

    public void setXoffset(Integer xoffset) {
        this.xoffset = xoffset;
    }

    public Integer getYoffset() {
        return yoffset;
    }

    public void setYoffset(Integer yoffset) {
        this.yoffset = yoffset;
    }
    
}
