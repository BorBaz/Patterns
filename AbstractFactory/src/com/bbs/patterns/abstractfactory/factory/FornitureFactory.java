package com.bbs.patterns.abstractfactory.factory;

import com.bbs.patterns.abstractfactory.product.abs.Chair;
import com.bbs.patterns.abstractfactory.product.abs.CoffeTable;
import com.bbs.patterns.abstractfactory.product.abs.Sofa;

public interface FornitureFactory {

    Chair createChair();

    Sofa createSofa();

    CoffeTable createCoffeTable();
}
