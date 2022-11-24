package com.bbs.patterns.abstractfactory.factory.concrete;

import com.bbs.patterns.abstractfactory.factory.FornitureFactory;
import com.bbs.patterns.abstractfactory.product.abs.Chair;
import com.bbs.patterns.abstractfactory.product.abs.CoffeTable;
import com.bbs.patterns.abstractfactory.product.abs.Sofa;
import com.bbs.patterns.abstractfactory.product.abs.concrete.chair.ArtDecoChair;
import com.bbs.patterns.abstractfactory.product.abs.concrete.coffetable.ArtDecoCT;
import com.bbs.patterns.abstractfactory.product.abs.concrete.sofa.ArtDecoSofa;

public class ArtDecoFornitureFactory implements FornitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new ArtDecoCT();
    }
}
