package com.app.project.model;

public class Car extends Vehicle{

    public Car(String id, Direction startRoad, Direction endRoad) {
        super(id, VehicleType.CAR, startRoad, endRoad);
    }
}
