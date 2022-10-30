package com.bbs.patterns.abstractfactory.factory.concrete;

import com.bbs.patterns.abstractfactory.factory.FornitureFactory;
import com.bbs.patterns.abstractfactory.product.abs.Chair;
import com.bbs.patterns.abstractfactory.product.abs.CoffeTable;
import com.bbs.patterns.abstractfactory.product.abs.Sofa;
import com.bbs.patterns.abstractfactory.product.abs.concrete.chair.VictorianChair;
import com.bbs.patterns.abstractfactory.product.abs.concrete.coffetable.VictorianCT;
import com.bbs.patterns.abstractfactory.product.abs.concrete.sofa.VictorianSofa;

public class VictorianFornitureFactory implements FornitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new VictorianCT();
    }
}
