package com.bbs.patterns.facade.api;

import java.time.LocalDateTime;

public class HotelAPI {

    public void lookForHotels(LocalDateTime departureDate, LocalDateTime returnDate, String origin, String destination) {
        System.out.println("==========================");
        System.out.println(" Hoteles encontrados de " + departureDate + " a " + departureDate);
        System.out.println("==========================");
    }

}
