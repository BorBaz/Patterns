package com.bbs.patterns.builder.client;

import com.bbs.patterns.builder.builder.concrete.CarBuilder;
import com.bbs.patterns.builder.builder.concrete.ManualBuilder;
import com.bbs.patterns.builder.director.Director;
import com.bbs.patterns.builder.product.Car;
import com.bbs.patterns.builder.product.Manual;

public class Client {

    public static void main(String[] args) {

    }

    public void makeCar() {

        var director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getProduct();

        ManualBuilder manualBuilder = new ManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.getProduct();

        /*
        Lo interesante de esto es que se usa el mismo director para construir dos objetos diferentes pero con las mismas
        propiedades en comun
         */

    }


}
