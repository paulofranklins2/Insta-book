package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {
    Hotel hotel = new Hotel("XYZ Hotel", 2, 4, 1, 2);

    @Test
    void getName() {
        assertEquals("XYZ Hotel", hotel.getName());
    }

    @Test
    void getNrOfSuites() {
        assertEquals(2, hotel.getNrOfSuites());
    }

    @Test
    void getNrOfRooms() {
        assertEquals(4, hotel.getNrOfRooms());
    }

    @Test
    void getBookedSuites() {
        assertEquals(1, hotel.getBookedSuites());
    }

    @Test
    void getBookedBasicRooms() {
        assertEquals(2, hotel.getBookedBasicRooms());
    }

    @Test
    void bookRoom() {
        assertTrue(hotel.bookRoom(1, true));
    }

    @Test
    void getAvailableRooms() {
        assertEquals(2, hotel.getAvailableRooms());
    }

    @Test
    void getAvailableSuites() {
        assertEquals(1, hotel.getAvailableSuites());
    }
}