/*
 * Copyright 2013 www.raistudies.com
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

import com.raistudies.jqplot4j.chart.ChartType;
import com.raistudies.jqplot4j.model.configuration.series.renderer.LineChatRendererOptions;

/**
 *
 * @author Rahul
 */
public class LineSeriesBuilder extends SimpleSeriesBuilder{

    public LineSeriesBuilder() {
        super(ChartType.LINE);
    }
    
    protected LineChatRendererOptions getChartRendererOptions() {
        LineChatRendererOptions chatRendererOptions = (LineChatRendererOptions) getSeriesDefaultOptions().getRendererOptions();
        if (chatRendererOptions == null) {
            chatRendererOptions = new LineChatRendererOptions();
            getSeriesDefaultOptions().setRendererOptions(chatRendererOptions);
        }
        return chatRendererOptions;
    }

    public void makeSmooth() {
        getChartRendererOptions().setSmooth(Boolean.TRUE);
    }
}
