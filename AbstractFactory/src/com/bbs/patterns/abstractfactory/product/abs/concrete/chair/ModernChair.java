package com.bbs.patterns.abstractfactory.product.abs.concrete.chair;

import com.bbs.patterns.abstractfactory.product.abs.Chair;

public class ModernChair implements Chair {

    private String woodType;

    @Override
    public boolean hasBackRest() {
        return false;
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }
}
