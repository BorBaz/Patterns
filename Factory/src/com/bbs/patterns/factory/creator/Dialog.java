package com.bbs.patterns.factory.creator;

import com.bbs.patterns.factory.product.impl.Button;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Dialog {

    // We do not convert this class into an interface because this could be an API some day

    public void render() {
        var button = createButton();
        button.onClick(() -> Logger.getLogger(Button.class.getName()).log(Level.INFO, "Iniciando  onClick del productor del Factory"));
        button.render();
    }

    public abstract Button createButton();

}
