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

package com.raistudies.jqplot4j.model.data;

import com.raistudies.jqplot4j.model.configuration.series.SeriesOptions;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rahul
 */
public class SeriesData {
    
    private List<Object> data = new ArrayList<Object>();
    private SeriesOptions seriesOptions;
    
    public List<Object> getData(){
        return data;
    }

    public void setData(List<Object> allSeriesData) {
        this.data = allSeriesData;
    }

    public SeriesOptions getSeriesOptions() {
        return seriesOptions;
    }

    public void setSeriesOptions(SeriesOptions seriesOptions) {
        this.seriesOptions = seriesOptions;
    }
    
    public void addNewSeriesData(Object seriesData){
        data.add(seriesData);
    }
    
}
