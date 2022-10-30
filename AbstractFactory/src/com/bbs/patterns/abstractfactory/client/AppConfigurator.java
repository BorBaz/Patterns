package com.bbs.patterns.abstractfactory.client;

import com.bbs.patterns.abstractfactory.factory.FornitureFactory;
import com.bbs.patterns.abstractfactory.factory.concrete.ArtDecoFornitureFactory;
import com.bbs.patterns.abstractfactory.factory.concrete.ModernFornitureFactory;
import com.bbs.patterns.abstractfactory.factory.concrete.VictorianFornitureFactory;

public class AppConfigurator {

    static FornitureFactory factory;

    public static void main(String[] args) {

        var config = readConfig();

        switch (config) {
            case "Victorian" -> factory = new VictorianFornitureFactory();
            case "ArtDeco" -> factory = new ArtDecoFornitureFactory();
            case "Modern" -> factory = new ModernFornitureFactory();
            default -> factory = null;
        }

        App app = new App(factory);
        // Esto es un ejemplo de como configurar un cliente
    }

    private static String readConfig() {
        return "Victorian";
    }
}
