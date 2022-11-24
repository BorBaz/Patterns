package com.bbs.patterns.builder.builder.concrete;

import com.bbs.patterns.builder.builder.Builder;
import com.bbs.patterns.builder.domain.Engine;
import com.bbs.patterns.builder.domain.TripComputer;
import com.bbs.patterns.builder.product.Manual;

public class ManualBuilder implements Builder<Manual> {

    private Manual manual;

    @Override
    public Manual getProduct() {
        var result = this.manual;
        this.reset();
        return result;
    }

    @Override
    public void reset() {
        this.manual = new Manual();
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
