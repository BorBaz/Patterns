package com.bbs.patterns.abstractfactory.factory.concrete;

import com.bbs.patterns.abstractfactory.factory.FornitureFactory;
import com.bbs.patterns.abstractfactory.product.abs.Chair;
import com.bbs.patterns.abstractfactory.product.abs.CoffeTable;
import com.bbs.patterns.abstractfactory.product.abs.Sofa;
import com.bbs.patterns.abstractfactory.product.abs.concrete.chair.ModernChair;
import com.bbs.patterns.abstractfactory.product.abs.concrete.coffetable.ModernCT;
import com.bbs.patterns.abstractfactory.product.abs.concrete.sofa.ModernSofa;

public class ModernFornitureFactory implements FornitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new ModernCT();
    }
}
