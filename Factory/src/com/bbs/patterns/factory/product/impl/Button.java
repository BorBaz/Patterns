package com.bbs.patterns.factory.product.impl;

import com.bbs.patterns.factory.action.BasicAction;

public interface Button {

    void render();

    void onClick(BasicAction action);

}
