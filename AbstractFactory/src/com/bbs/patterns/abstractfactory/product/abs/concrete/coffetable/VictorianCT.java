package com.bbs.patterns.abstractfactory.product.abs.concrete.coffetable;

import com.bbs.patterns.abstractfactory.product.abs.CoffeTable;

public class VictorianCT implements CoffeTable {
    @Override
    public int numberOfTableLegs() {
        return 0;
    }
}
