package com.example.aviationcompanyprovidinghelicopterservice2310898;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML private Button pilotButton;
    @FXML private Button maintenanceManagerButton;

    @FXML
    public void openPilotDashboard() throws Exception {
        loadScene("/View/PilotDashboard.fxml");
    }

    @FXML
    public void openMaintenanceManagerDashboard() throws Exception {
        loadScene("/View/MaintenanceManagerDashboard.fxml");
    }

    private void loadScene(String fxmlPath) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
        Stage stage = (Stage) pilotButton.getScene().getWindow();
        stage.setScene(new Scene(loader.load()));
    }
}

