package com.dawciobiel;


// Java program to create a button and add event handler to it

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Button1 extends Application {

    public static void main(String[] args) {
        // launch the application
        launch(args);
    }

    // launch the application
    public void start(Stage s) {
        // set title for the stage
        s.setTitle("creating buttons");

        // create a button
        Button b = new Button("button");

        // create a stack pane
        TilePane r = new TilePane();

        // create a label
        Label l = new Label("button not selected");

        // action event
        EventHandler<ActionEvent> event = e -> l.setText("   button   selected    ");

        // when button is pressed
        b.setOnAction(event);

        // add button
        r.getChildren().add(b);
        r.getChildren().add(l);

        // create a scene
        Scene sc = new Scene(r, 200, 200);

        // set the scene
        s.setScene(sc);

        s.show();
    }
}
