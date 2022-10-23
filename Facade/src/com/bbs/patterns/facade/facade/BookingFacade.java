package com.bbs.patterns.facade.facade;

import com.bbs.patterns.facade.api.HotelAPI;
import com.bbs.patterns.facade.api.PlaneAPI;

import java.time.LocalDateTime;

public class BookingFacade {

    HotelAPI hotelAPI;
    PlaneAPI planeAPI;

    public BookingFacade(){
        hotelAPI = new HotelAPI();
        planeAPI = new PlaneAPI();
    }

    public void book(LocalDateTime departureDate, LocalDateTime returnDate, String origin, String destination){
        planeAPI.lookForFlights(departureDate, returnDate, origin, destination);
        hotelAPI.lookForHotels(departureDate, returnDate, origin, destination);
    }
}
