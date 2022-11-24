package com.bbs.patterns.facade.client;

import com.bbs.patterns.facade.facade.BookingFacade;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {

        var caseOfAWomanSearchingSomeHolidaysInEurope = new BookingFacade();
        caseOfAWomanSearchingSomeHolidaysInEurope.book(LocalDateTime.now(), LocalDateTime.now(), "Madrid", "Berlin");

        var caseOfAManSearchingSomeHolidaysInAmerica = new BookingFacade();
        caseOfAManSearchingSomeHolidaysInAmerica.book(LocalDateTime.now(), LocalDateTime.now(), "Mexico", "Canada");

    }
}
