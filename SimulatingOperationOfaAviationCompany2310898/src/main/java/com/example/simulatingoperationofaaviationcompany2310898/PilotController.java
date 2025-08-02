package com.example.simulatingoperationofaaviationcompany2310898;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class PilotController {

    @FXML
    private Label pilotWelcomeLabel;

    @FXML
    private void onViewScheduleClicked() {
        pilotWelcomeLabel.setText("Here is your flight schedule!");
        // Add code to load/display schedule here
    }

    @FXML
    private void onSubmitReportClicked() {
        pilotWelcomeLabel.setText("Report submitted!");
    }
