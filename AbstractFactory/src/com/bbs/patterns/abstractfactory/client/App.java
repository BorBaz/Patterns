package com.bbs.patterns.abstractfactory.client;

import com.bbs.patterns.abstractfactory.factory.FornitureFactory;
import com.bbs.patterns.abstractfactory.product.abs.Chair;
import com.bbs.patterns.abstractfactory.product.abs.CoffeTable;
import com.bbs.patterns.abstractfactory.product.abs.Sofa;

public class App {

    FornitureFactory factory;

    public App(FornitureFactory factory) {
        this.factory = factory;
    }

    public Chair obtainChair() {
        return factory.createChair();
    }

    public Sofa obtainSofa() {
        return factory.createSofa();
    }

    public CoffeTable obtaCoffeTable() {
        return factory.createCoffeTable();
    }

}
