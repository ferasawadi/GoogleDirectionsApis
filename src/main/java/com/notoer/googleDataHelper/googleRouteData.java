package com.notoer.googleDataHelper;

import java.util.List;

public class googleRouteData {
    private bound bounds;
    private List<googleLeg> legs;
    //    private List<googleLeg> legs;
    private points overview_polyline;
    private String copyrights;
    private String summary;


    public List<googleLeg> getLegs() {
        return legs;
    }

    public void setLegs(List<googleLeg> legs) {
        this.legs = legs;
    }

    public points getOverview_polyline() {
        return overview_polyline;
    }

    public void setOverview_polyline(points overview_polyline) {
        this.overview_polyline = overview_polyline;
    }

    public bound getBounds() {
        return bounds;
    }

    public void setBounds(bound bounds) {
        this.bounds = bounds;
    }

    public String getCopyrights() {
        return copyrights;
    }

    public void setCopyrights(String copyrights) {
        this.copyrights = copyrights;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

}



