package com.bbs.patterns.factory.app;

import com.bbs.patterns.factory.creator.impl.WebDialog;
import com.bbs.patterns.factory.creator.impl.WindowsDialog;

public class App {

    public static void main(String[] args) {

        var config = readConfig();

        switch (config) {
            case "Windows":
                new WindowsDialog().render();
                break;
            case "Web":
                new WebDialog().render();
                break;
            default:
                // do nothing about it
        }
    }

    private static String readConfig() {
        return "Web";
    }
}
