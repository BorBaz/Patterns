package com.bbs.patterns.abstractfactory.product.abs.concrete.chair;

import com.bbs.patterns.abstractfactory.product.abs.Chair;

public class VictorianChair implements Chair {

    private String color;

    @Override
    public boolean hasBackRest() {
        return false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
