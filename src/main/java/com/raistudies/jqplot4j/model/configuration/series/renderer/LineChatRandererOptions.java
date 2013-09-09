package com.raistudies.jqplot4j.model.configuration.series.renderer;

/**
 *
 * @author Rahul
 */
public class LineChatRandererOptions  extends SeriesRandererOptions {
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
