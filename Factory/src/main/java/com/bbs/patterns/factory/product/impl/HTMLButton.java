package com.bbs.patterns.factory.product.impl;

import com.bbs.patterns.factory.action.BasicAction;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class HTMLButton implements Button {
    @Override
    public void render() {
        Logger.getLogger(HTMLButton.class.getName()).log(Level.INFO, "Estoy usando render de HTML");
    }

    @Override
    public void onClick(BasicAction action) {
        action.onAction();
        Logger.getLogger(HTMLButton.class.getName()).log(Level.INFO, "Estoy onClick de HTML");
    }
}
