package com.bbs.patterns.factory.product.impl;

import com.bbs.patterns.factory.action.BasicAction;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class JWTButton implements Button {


    @Override
    public void render() {
        Logger.getLogger(JWTButton.class.getName()).log(Level.INFO, "Estoy usando render de JWT");
    }

    @Override
    public void onClick(BasicAction action) {
        action.onAction();
        Logger.getLogger(JWTButton.class.getName()).log(Level.INFO, "Estoy usando onClick de JWT");
    }
}
