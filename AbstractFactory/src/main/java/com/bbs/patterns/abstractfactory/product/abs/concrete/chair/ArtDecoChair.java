package com.bbs.patterns.abstractfactory.product.abs.concrete.chair;

import com.bbs.patterns.abstractfactory.product.abs.Chair;

public class ArtDecoChair implements Chair {

    private boolean boo;

    @Override
    public boolean hasBackRest() {
        return false;
    }

    public boolean isBoo() {
        return boo;
    }

    public void setBoo(boolean boo) {
        this.boo = boo;
    }
}
