package com.app.project;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class AppLogger {
    private static final AppLogger instance = new AppLogger();
    private int messageCounter = 1;

    private final StringProperty currentMessage = new SimpleStringProperty("");

    private AppLogger(){

    }

    public static AppLogger getInstance(){
        return instance;
    }

    public StringProperty messageProperty(){
        return currentMessage;
    }

    public void log(String message){
        String out = messageCounter + ". " + message;
        currentMessage.set(out);
        System.out.println(out);
        messageCounter++;

    }
}
