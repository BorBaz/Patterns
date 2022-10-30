package com.bbs.patterns.abstractfactory.product.abs.concrete.sofa;

import com.bbs.patterns.abstractfactory.product.abs.Sofa;

public class ArtDecoSofa implements Sofa {
    @Override
    public boolean hasCushion() {
        return false;
    }

    @Override
    public boolean isRemovable() {
        return false;
    }
}
