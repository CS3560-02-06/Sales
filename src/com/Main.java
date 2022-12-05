package com;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.*;

public class Main extends Application {

    private static Stage stg;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stg = primaryStage;
        File f = new File("src/com/mainpage.fxml");
        Parent root = FXMLLoader.load(f.toURI().toURL());

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Department Store");
        primaryStage.show();
    }

    public void ChangeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("/" + fxml));
        stg.getScene().setRoot(pane);
    }
}