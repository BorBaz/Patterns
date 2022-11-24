package com.bbs.patterns.builder.director;

import com.bbs.patterns.builder.builder.Builder;
import com.bbs.patterns.builder.domain.Engine;
import com.bbs.patterns.builder.domain.TripComputer;
import com.bbs.patterns.builder.product.Car;

public class Director {

    public void constructSportsCar(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new Engine());
        builder.setTripComputer(new TripComputer());
    }

    public void constructSUV(Builder builder){
        builder.reset();
        builder.setSeats(6);
        builder.setEngine(new Engine());
        builder.setTripComputer(new TripComputer());
    }



}
