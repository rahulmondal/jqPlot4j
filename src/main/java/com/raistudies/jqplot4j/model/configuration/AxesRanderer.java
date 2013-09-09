package com.raistudies.jqplot4j.model.configuration;

/**
 *
 * @author Rahul
 */
public enum AxesRanderer {
    LinearAxisRenderer(""),
    DateAxisRenderer("$.jqplot.DateAxisRenderer"),
    CanvasAxisLabelRenderer("$.jqplot.CanvasAxisLabelRenderer"),
    CategoryAxisRenderer("$.jqplot.CategoryAxisRenderer"),
    CanvasAxisTickRenderer("$.jqplot.CanvasAxisTickRenderer"),
    LogAxisRenderer("$.jqplot.LogAxisRenderer"),
    MekkoAxisRenderer("$.jqplot.MekkoAxisRenderer");
    
    private String jsRanderer;

    private AxesRanderer(String jsRanderer) {
        this.jsRanderer = jsRanderer;
    }

    public String getJsRanderer() {
        return jsRanderer;
    }
}
