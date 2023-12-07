package com.example.messenger;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root_load = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("LoadGui.fxml")));
        Scene scene_loadd = new Scene(root_load,452,699);
        stage.setTitle("Messenger");
        stage.setScene(scene_loadd);
        stage.show();

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MainUI.fxml")));
        Task<Scene> renderTask = new Task<>() {
            @Override
            protected Scene call() {
                // Simulate a long-running task by pausing for a few seconds
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // Create the main scene
                Scene scene = new Scene(root, 452, 699);
                scene.setCamera(new PerspectiveCamera());
                return scene;
            }
        };
        renderTask.setOnSucceeded(event -> stage.setScene(renderTask.getValue()));

        new Thread(renderTask).start();


    }

    public static void main(String[] args) {
        launch();
    }
}