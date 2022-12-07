package com.bbs.patterns.adapter.round;

public class RoundPeg {

    private double radious;

    public RoundPeg(double radious) {
        this.radious = radious;
    }

    public RoundPeg() {
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public boolean fits(RoundHole roundHole) {
        var result = false;
        result = (this.getRadious() <= roundHole.getRadious());
        return result;
    }
}
