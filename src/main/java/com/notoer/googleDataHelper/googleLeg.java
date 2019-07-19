package com.notoer.googleDataHelper;


import java.util.List;

public class googleLeg {
    private legInfo distance;
    private legInfo duration;
    private String start_address;
    private String end_address;
    private List<legSteps> steps;

    public List<legSteps> getSteps() {
        return steps;
    }

    public void setSteps(List<legSteps> steps) {
        this.steps = steps;
    }

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

    public googleLeg(String start_address, String end_address) {
        this.start_address = start_address;
        this.end_address = end_address;
    }

    public String getStart_address() {
        return start_address;
    }

    public void setStart_address(String start_address) {
        this.start_address = start_address;
    }

    public String getEnd_address() {
        return end_address;
    }

    public void setEnd_address(String end_address) {
        this.end_address = end_address;
    }
}
