package com.example.helicopter_service_2321523.Accountant;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AccountantController {

    @FXML
    private Label nameLabel;

    @FXML
    private Label idLabel;

    @FXML
    private Label salaryLabel;

    @FXML
    private Label departmentLabel;

    @FXML
    private Label frequencyLabel;

    public void setAccountant(Accountant accountant) {
        nameLabel.setText(accountant.getUserName());
        idLabel.setText(String.valueOf(accountant.getUserId()));
        salaryLabel.setText(String.valueOf(accountant.getSalary()));
        departmentLabel.setText(accountant.getDepartment());
        frequencyLabel.setText(accountant.getReportFrequency());
    }
}
