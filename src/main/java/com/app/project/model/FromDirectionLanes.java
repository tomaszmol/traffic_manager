package com.app.project.model;

import java.util.*;

public class FromDirectionLanes {
    private final Direction fromDirection;
    private List<Lane> lanes = new ArrayList<>();

    public FromDirectionLanes(Direction fromDirection) {
        this.fromDirection = fromDirection;
        Lane initialLane = new Lane();
        initialLane.addAllPossibleDestinations(fromDirection);
        this.lanes.add(new Lane());
    }

    public void addLane(){
        lanes.getLast().removePossibleDestination(fromDirection.getOppositeDirection().getRightDirection());
        Lane newLane = new Lane();
        Set<Direction> newDestinations = new HashSet<Direction>();
        newDestinations.add(fromDirection.getOppositeDirection());
        newDestinations.add(fromDirection.getOppositeDirection().getRightDirection());
        newLane.addAll(newDestinations);
        lanes.add(new Lane());
    }

    public void removeLastLane(){
        lanes.removeLast();
        lanes.getLast().addPossibleDestination(fromDirection.getOppositeDirection().getRightDirection());
    }


}
