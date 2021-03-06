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

package com.raistudies.jqplot4j.builder.series;

import com.raistudies.jqplot4j.model.configuration.series.SeriesOptions;
import com.raistudies.jqplot4j.model.data.SeriesData;

/**
 *
 * @author Rahul
 */
public abstract class AbstractSeriesBuilder  implements SeriesBuilder {
    protected SeriesData chartData = new SeriesData();
    
    public SeriesOptions getSeriesDefaultOptions(){
        SeriesOptions defaultOptions = chartData.getSeriesOptions();
        if(defaultOptions == null){
            defaultOptions = new SeriesOptions();
            chartData.setSeriesOptions(defaultOptions);
        }
        return defaultOptions;
    }
}
