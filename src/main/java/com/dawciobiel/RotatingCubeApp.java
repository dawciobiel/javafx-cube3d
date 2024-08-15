package com.dawciobiel;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import static javafx.animation.Animation.INDEFINITE;

public class RotatingCubeApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Tworzymy sześcian
        Box cube = new Box(200, 200, 200);

        // Dodajemy materiał, aby sześcian był widoczny
        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.CORNFLOWERBLUE);
        material.setSpecularColor(Color.LIGHTBLUE);
        cube.setMaterial(material);

        // Ustawiamy kamerę
        PerspectiveCamera camera = new PerspectiveCamera(true);
        camera.setTranslateZ(-500);

        // Tworzymy grupę i dodajemy sześcian do grupy
        Group root = new Group();
        root.getChildren().add(cube);

        // Tworzymy scenę
        Scene scene = new Scene(root, 600, 400, true);
        scene.setFill(Color.GRAY);
        scene.setCamera(camera);

        // Obracanie względem osi OX
        RotateTransition rotateX = new RotateTransition(Duration.seconds(4), cube);
        rotateX.setAxis(Rotate.X_AXIS);
        rotateX.setByAngle(360);
        rotateX.setCycleCount(INDEFINITE);
        rotateX.setAutoReverse(false);
        rotateX.play();

        // Obracanie względem osi OY
        RotateTransition rotateY = new RotateTransition(Duration.seconds(6), cube);
        rotateY.setAxis(Rotate.Y_AXIS);
        rotateY.setByAngle(360);
        rotateY.setCycleCount(INDEFINITE);
        rotateY.setAutoReverse(false);
        rotateY.play();

        // Obracanie względem osi OZ
        RotateTransition rotateZ = new RotateTransition(Duration.seconds(8), cube);
        rotateZ.setAxis(Rotate.Z_AXIS);
        rotateZ.setByAngle(360);
        rotateZ.setCycleCount(INDEFINITE);
        rotateZ.setAutoReverse(false);
        rotateZ.play();

        // Ustawiamy tytuł okna
        primaryStage.setTitle("Rotating 3D Cube in JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
