package com.app.project;

import com.app.project.model.Direction;
import com.app.project.model.Intersection;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class MapController {

    @FXML
    public Canvas fromNorthLanes;

    @FXML
    public Canvas fromEastLanes;

    @FXML
    public Canvas fromSouthLanes;

    @FXML
    public Canvas fromWestLanes;

    private GraphicsContext gcFromNorthLanes;
    private GraphicsContext gcFromEastLanes;
    private GraphicsContext gcFromSouthLanes;
    private GraphicsContext gcFromWestLanes;

    @FXML
    public void initialize() {
        // Uzyskanie dostępu do GraphicsContext, aby rysować na Canvas
        gcFromNorthLanes = fromNorthLanes.getGraphicsContext2D();
        gcFromEastLanes = fromEastLanes.getGraphicsContext2D();
        gcFromSouthLanes = fromSouthLanes.getGraphicsContext2D();
        gcFromWestLanes = fromWestLanes.getGraphicsContext2D();




        gcFromSouthLanes.setFill(Color.web("#4b514a")); // Ustawienie koloru wypełnienia
        gcFromSouthLanes.fillRect(300,0,30,600);
    }

    public MapController(){
    }


//    //dokonczyc
//    public void addLane(Intersection intersection,Direction fromDirection){
//        switch (fromDirection) {
//            case NORTH -> EAST;
//            case EAST -> SOUTH;
//            case SOUTH -> WEST;
//            case WEST -> NORTH;
//        };
//    }


}

