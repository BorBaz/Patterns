package com.bbs.patterns.abstractfactory.product.abs.concrete.coffetable;

import com.bbs.patterns.abstractfactory.product.abs.CoffeTable;

public class ArtDecoCT implements CoffeTable {
    @Override
    public int numberOfTableLegs() {
        return 1;
    }
}
