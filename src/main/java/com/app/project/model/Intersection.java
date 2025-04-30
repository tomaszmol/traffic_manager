package com.app.project.model;

import java.util.HashMap;
import java.util.Map;

public class Intersection {
    Map<Direction, FromDirectionLanes> lanes = new HashMap<>();

    public Intersection(){
        for (Direction direction : Direction.values()) {
            lanes.put(direction, new FromDirectionLanes(direction));
        }
    }
}
