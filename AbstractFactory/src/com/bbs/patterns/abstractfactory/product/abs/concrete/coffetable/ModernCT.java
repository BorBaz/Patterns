package com.bbs.patterns.abstractfactory.product.abs.concrete.coffetable;

import com.bbs.patterns.abstractfactory.product.abs.CoffeTable;

public class ModernCT implements CoffeTable {
    @Override
    public int numberOfTableLegs() {
        return 3;
    }
}
