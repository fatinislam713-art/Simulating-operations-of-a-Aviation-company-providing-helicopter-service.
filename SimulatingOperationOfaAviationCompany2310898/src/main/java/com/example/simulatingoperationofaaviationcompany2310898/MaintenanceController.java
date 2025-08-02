package com.example.simulatingoperationofaaviationcompany2310898;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MaintenanceController {

    @FXML
    private Label maintenanceWelcomeLabel;

    @FXML
    private void onViewLogsClicked() {
        maintenanceWelcomeLabel.setText("Displaying maintenance logs...");
        // Add code to load logs here
    }

    @FXML
    private void onRequestPartsClicked() {
        maintenanceWelcomeLabel.setText("Parts request submitted!");
        // Add code to handle parts requests here
    }
}
