package com.bbs.patterns.builder.builder;

public interface Builder {

    void reset();
    void setSeats(int seatsNumber);
    void setEngine(Engine engine);
    void setTripComputer(TripComputer tripComputer);

}
