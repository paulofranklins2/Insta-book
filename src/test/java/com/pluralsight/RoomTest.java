package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    Room room = new Room(2, 124, true, false);

    @Test
    void getNrOfBeds() {
        assertEquals(2, room.getNrOfBeds());
    }

    @Test
    void setNrOfBeds() {
        room.setNrOfBeds(3);
        assertEquals(3, room.getNrOfBeds());
    }

    @Test
    void getPrice() {
        assertEquals(124, room.getPrice());
    }

    @Test
    void setPrice() {
        room.setPrice(150);
        assertEquals(150, room.getPrice());
    }

    @Test
    void isOccupied() {
        assertTrue(room.isOccupied());
    }

    @Test
    void setOccupied() {
        room.setOccupied(false);
        assertFalse(room.isOccupied());
    }

    @Test
    void isDirty() {
        assertFalse(room.isDirty());
    }

    @Test
    void setDirty() {
        room.setDirty(true);
        assertTrue(room.isDirty());
    }

    @Test
    void isAvailable() {
        assertFalse(room.isAvailable());
    }

    @Test
    void checkIn() {
        room.checkIn();
        assertTrue(room.isOccupied());
    }

    @Test
    void checkOut() {
        room.checkOut();
        assertTrue(room.isAvailable());
    }

    @Test
    void cleanRoom() {
        room.setOccupied(false);
        room.cleanRoom();
        assertFalse(room.isDirty());
    }
}