package com.bbs.patterns.adapter.round;

public class RoundHole {

    private double radious;

    public RoundHole(double radious) {
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public boolean fits(RoundPeg roundPeg) {
        var result = false;

        result = (this.getRadious() <= roundPeg.getRadious());

        return result;
    }
}
