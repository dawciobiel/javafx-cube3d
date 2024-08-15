package com.dawciobiel;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class CubeExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        Box cube = new Box(100, 100, 100);
        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.DODGERBLUE);
        cube.setMaterial(material);

        cube.getTransforms().addAll(
                new Rotate(45, Rotate.X_AXIS),
                new Rotate(45, Rotate.Y_AXIS)
        );

        Group root = new Group(cube);
        Scene scene = new Scene(root, 400, 400, true);

        PerspectiveCamera camera = new PerspectiveCamera(true);
        camera.getTransforms().add(new Translate(0, 0, -300));
        scene.setCamera(camera);

        primaryStage.setScene(scene);
        primaryStage.setTitle("3D Cube Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
