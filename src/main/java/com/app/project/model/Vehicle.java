package com.app.project.model;

public abstract class Vehicle {
    private final String vehicleId;
    private final VehicleType type;
    private final Direction startRoad;
    private final Direction endRoad;

    public Vehicle(String id, VehicleType vehicleType, Direction startRoad, Direction endRoad) {
        this.vehicleId = id;
        this.type = vehicleType;
        this.startRoad = startRoad;
        this.endRoad = endRoad;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public VehicleType getType() {
        return type;
    }

    public Direction getEndRoad() {
        return endRoad;
    }

    public Direction getStartRoad() {
        return startRoad;
    }

}
