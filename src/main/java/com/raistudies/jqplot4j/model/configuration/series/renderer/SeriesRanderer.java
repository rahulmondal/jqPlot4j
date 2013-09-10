package com.raistudies.jqplot4j.model.configuration.series.renderer;

/**
 *
 * @author Rahul
 */
public enum SeriesRanderer {
    
    BarRenderer("$.jqplot.BarRenderer"),
    BubbleRenderer("$.jqplot.BubbleRenderer"),
    PieRenderer("$.jqplot.PieRenderer"),
    DonutRenderer("$.jqplot.DonutRenderer"),
    PyramidRenderer("$.jqplot.PyramidRenderer"),
    OHLCRenderer("$.jqplot.OHLCRenderer"),
    MekkoRenderer("$.jqplot.MekkoRenderer"),
    MeterGaugeRenderer("$.jqplot.MeterGaugeRenderer");
    
    private final String jsRanderer;

    private SeriesRanderer(String jsRanderer) {
        this.jsRanderer = jsRanderer;
    }

    public String getJsRanderer() {
        return jsRanderer;
    }
}
