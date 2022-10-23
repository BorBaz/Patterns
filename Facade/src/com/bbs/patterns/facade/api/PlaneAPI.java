package com.bbs.patterns.facade.api;

import java.time.LocalDateTime;

public class PlaneAPI {

    public void lookForFlights(LocalDateTime departureDate, LocalDateTime returnDate, String origin, String destination){
        System.out.println("==========================");
        System.out.println(" Vuelos encontrados de " + departureDate + " a " + departureDate);
        System.out.println("==========================");
    }
}
