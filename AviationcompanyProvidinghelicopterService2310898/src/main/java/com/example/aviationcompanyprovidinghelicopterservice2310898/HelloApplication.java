package com.example.aviationcompanyprovidinghelicopterservice2310898;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/View/HelloView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Aviation Company Helicopter Service");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}