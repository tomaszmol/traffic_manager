package com.app.project.model;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Lane {
    public LinkedList<Vehicle> vehicles =  new LinkedList<>();

    private Set<Direction> possibleDestinations = new HashSet<>();

    public Lane(){
    }

    public Lane(Direction possibleDestination){
        this.possibleDestinations.add(possibleDestination);
    }

    public Lane(Set<Direction> possibleDestinations) {
        this.possibleDestinations = possibleDestinations;
    }

    public Set<Direction> getPossibleDestinations() {
        return possibleDestinations;
    }

    public boolean isPossibleDestination(Direction possibleDestination){
        return possibleDestinations.contains(possibleDestination);
    }

    public void addPossibleDestination(Direction possibleDestination) {
        this.possibleDestinations.add(possibleDestination);
    }

    public void addAll(Set<Direction> possibleDestinations) {
        this.possibleDestinations.addAll(possibleDestinations);
    }

    public void addAllPossibleDestinations(Direction from){
        for (Direction direction : Direction.values()) {
            if(direction != from){
                addPossibleDestination(direction);
            }
        }
    }

    public void removePossibleDestination(Direction destination){
        possibleDestinations.remove(destination);
    }

}
