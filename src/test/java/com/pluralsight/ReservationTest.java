package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {
    Reservation reservation = new Reservation("king", 2, true);

    @Test
    void getRoomType() {
        assertEquals("king", reservation.getRoomType());
    }

    @Test
    void setRoomType() {
        reservation.setRoomType("basic");
        assertEquals("basic", reservation.getRoomType());
    }

    @Test
    void getNrOfNights() {
        assertEquals(2, reservation.getNrOfNights());
    }

    @Test
    void setNrOfNights() {
        reservation.setNrOfNights(3);
        assertEquals(3, reservation.getNrOfNights());
    }

    @Test
    void isWeekend() {
        assertTrue(reservation.isWeekend());
    }

    @Test
    void setWeekend() {
        reservation.setWeekend(false);
        assertFalse(reservation.isWeekend());
    }

    @Test
    void getPrice() {
        assertEquals(152.9, reservation.getPrice());
    }

    @Test
    void getReservationTotal() {
        assertEquals(305.8, reservation.getReservationTotal());
    }
}