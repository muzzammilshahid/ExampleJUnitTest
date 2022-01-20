package com.deskconn.junittest.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void getMake() {
        Car car = new Car("Yo");
        assertEquals("Yo", car.getMake());
    }

    @Test
    void setMake() {
        Car car = new Car("yes");
        car.setMake("testSuccess");
        assertEquals("testSuccess", car.getMake());
    }
}