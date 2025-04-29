package com.app.project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button button;

    // Metoda obsługująca kliknięcie przycisku
    @FXML
    public void handleButtonClick() {
        System.out.println("Button clicked!");
    }
}
