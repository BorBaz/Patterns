package com.bbs.patterns.builder.builder;

import com.bbs.patterns.builder.domain.Engine;
import com.bbs.patterns.builder.domain.TripComputer;

public interface Builder {

    void reset();
    void setSeats(int seatsNumber);
    void setEngine(Engine engine);
    void setTripComputer(TripComputer tripComputer);

}
