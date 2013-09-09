package com.raistudies.jqplot4j.model.configuration;

/**
 *
 * @author Rahul
 */
public class TickOptions {
    // Where to put the tick mark on the axis
    private MarkType mark;
    
    private Boolean showMark;
    
    private Boolean showGridline;
    
    private Boolean isMinorTick;
    
    private Integer markSize;
    
    private Boolean show;
    
    private Boolean showLabel;
    
    private String prefix;
    
    private String suffix;
    
    private String formatString;
    
    private String fontFamily;
    
    private String fontSize;
    
    private String textColor;
    
    private Boolean escapeHTML;

    public MarkType getMark() {
        return mark;
    }

    public void setMark(MarkType mark) {
        this.mark = mark;
    }

    public Boolean getShowMark() {
        return showMark;
    }

    public void setShowMark(Boolean showMark) {
        this.showMark = showMark;
    }

    public Boolean getShowGridline() {
        return showGridline;
    }

    public void setShowGridline(Boolean showGridline) {
        this.showGridline = showGridline;
    }

    public Boolean getIsMinorTick() {
        return isMinorTick;
    }

    public void setIsMinorTick(Boolean isMinorTick) {
        this.isMinorTick = isMinorTick;
    }

    public Integer getMarkSize() {
        return markSize;
    }

    public void setMarkSize(Integer markSize) {
        this.markSize = markSize;
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public Boolean getShowLabel() {
        return showLabel;
    }

    public void setShowLabel(Boolean showLabel) {
        this.showLabel = showLabel;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getFormatString() {
        return formatString;
    }

    public void setFormatString(String formatString) {
        this.formatString = formatString;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public Boolean getEscapeHTML() {
        return escapeHTML;
    }

    public void setEscapeHTML(Boolean escapeHTML) {
        this.escapeHTML = escapeHTML;
    }
    
    public enum MarkType{
        outside, inside, cross
    }
}
