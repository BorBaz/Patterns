package com.bbs.patterns.factory.creator.impl;

import com.bbs.patterns.factory.creator.Dialog;
import com.bbs.patterns.factory.product.impl.Button;
import com.bbs.patterns.factory.product.impl.JWTButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new JWTButton();
    }
}
