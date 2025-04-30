package com.app.project;

import com.app.project.model.Intersection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class Controller {
    MapController mapController = new MapController();

    @FXML
    private Label logLabel;


    @FXML
    public void handleNorthAddLaneClick(ActionEvent actionEvent) {
        AppLogger.getInstance().log("polnoc");

    }

    @FXML
    public void handleWestAddLaneClick(ActionEvent actionEvent) {
        AppLogger.getInstance().log("zachod");
    }

    @FXML
    public void handleEastAddLaneClick(ActionEvent actionEvent) {
        AppLogger.getInstance().log("polnoc");
    }

    @FXML
    public void handleSouthAddLaneClick(ActionEvent actionEvent) {
        AppLogger.getInstance().log("polnoc");
    }
}
