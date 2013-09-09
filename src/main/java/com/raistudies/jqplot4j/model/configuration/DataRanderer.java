package com.raistudies.jqplot4j.model.configuration;

/**
 *
 * @author Rahul
 */
public enum DataRanderer {
    BarRenderer("$.jqplot.BarRenderer");
    
    private String jsRanderer;

    private DataRanderer(String jsRanderer) {
        this.jsRanderer = jsRanderer;
    }

    public String getJsRanderer() {
        return jsRanderer;
    }
    
}
