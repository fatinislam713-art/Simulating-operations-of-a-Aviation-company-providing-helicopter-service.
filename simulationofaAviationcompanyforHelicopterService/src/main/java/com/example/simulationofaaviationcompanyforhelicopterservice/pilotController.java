package com.example.simulationofaaviationcompanyforhelicopterservice;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class pilotController {
    package com.example.simulationofaviationcompanyforhelicopterservice;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

    public class PilotController {

        @FXML
        private Label pilotStatusLabel;

        @FXML
        private Button refreshButton;

        @FXML
        protected void onRefreshClicked() {
            pilotStatusLabel.setText("Updated Flight Schedule at " + java.time.LocalTime.now());
        }
    }

}
