package com.bbs.patterns.builder.builder.concrete;

import com.bbs.patterns.builder.builder.Builder;
import com.bbs.patterns.builder.domain.Engine;
import com.bbs.patterns.builder.domain.TripComputer;
import com.bbs.patterns.builder.product.Car;

public class CarBuilder implements Builder<Car> {

    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public Car getProduct() {
        var result = this.car;
        this.reset();
        return result;
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int seatsNumber) {
        // Do something
    }

    @Override
    public void setEngine(Engine engine) {
        // Do something
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        // Do something
    }
}
