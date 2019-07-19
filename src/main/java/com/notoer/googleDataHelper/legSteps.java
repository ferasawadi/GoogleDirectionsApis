package com.notoer.googleDataHelper;


public class legSteps {
    private legInfo distance;
    private legInfo duration;
    private coordinations start_location;
    private coordinations end_location;
    private routePolyLine polyline;
    private String html_instructions;
    private String travel_mode;


    public legInfo getDistance() {
        return distance;
    }

    public void setDistance(legInfo distance) {
        this.distance = distance;
    }

    public legInfo getDuration() {
        return duration;
    }

    public void setDuration(legInfo duration) {
        this.duration = duration;
    }

    public coordinations getStart_location() {
        return start_location;
    }

    public void setStart_location(coordinations start_location) {
        this.start_location = start_location;
    }

    public coordinations getEnd_location() {
        return end_location;
    }

    public void setEnd_location(coordinations end_location) {
        this.end_location = end_location;
    }

    public routePolyLine getPolyline() {
        return polyline;
    }

    public void setPolyline(routePolyLine polyline) {
        this.polyline = polyline;
    }

    public String getHtml_instructions() {
        return html_instructions;
    }

    public void setHtml_instructions(String html_instructions) {
        this.html_instructions = html_instructions;
    }

    public String getTravel_mode() {
        return travel_mode;
    }

    public void setTravel_mode(String travel_mode) {
        this.travel_mode = travel_mode;
    }
}