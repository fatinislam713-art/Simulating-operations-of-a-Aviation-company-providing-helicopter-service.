package com.example.helicopter_service_2321523.SecurityOfficer;


import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecurityOfficerController {

    @FXML
    private Label nameLabel;

    @FXML
    private Label userIdLabel;

    @FXML
    private Label clearanceLevelLabel;

    @FXML
    private Label shiftTimeLabel;

    // This method should be called by your application when loading the dashboard
    public void setSecurityOfficer(SecurityOfficer officer) {
        nameLabel.setText("Name: " + officer.getUserName());
        userIdLabel.setText("User ID: " + officer.getUserId());
        clearanceLevelLabel.setText("Clearance Level: " + officer.getClearanceLevel());
        shiftTimeLabel.setText("Shift Time: " + officer.getShiftTime());
    }
}