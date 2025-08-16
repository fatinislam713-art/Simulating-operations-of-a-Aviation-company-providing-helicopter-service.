package com.example.helicopterservice_2321523.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Tab;

import java.io.IOException;

public class MainController {

    @FXML
    private Tab accountantTab;

    @FXML
    private Tab securityTab;

    // Optional: hold references to included controllers
    private AccountantController accountantController;
    private SecurityOfficerController securityController;

    @FXML
    private void initialize() {
        try {
            // Load AccountantView
            FXMLLoader accLoader = new FXMLLoader(getClass().getResource("/com/example/helicopterservice_2321523/view/AccountantView.fxml"));
            Parent accountantRoot = accLoader.load();
            accountantController = accLoader.getController();
            accountantTab.setContent(accountantRoot);

            // Load SecurityOfficerView
            FXMLLoader secLoader = new FXMLLoader(getClass().getResource("/com/example/helicopterservice_2321523/view/SecurityOfficerView.fxml"));
            Parent securityRoot = secLoader.load();
            securityController = secLoader.getController();
            securityTab.setContent(securityRoot);

        } catch (IOException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR, "Failed to load included views.");
            alert.setHeaderText("Error");
            alert.showAndWait();
        }
    }

    @FXML
    private void onReload(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "UI reloaded (no state reset).");
        alert.setHeaderText("Reload");
        alert.showAndWait();
    }

    @FXML
    private void onAbout(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About HeliOps");
        alert.setHeaderText("HeliOps Control Console");
        alert.setContentText("JavaFX OOP simulation for an aviation company.\nModules: Accountant & Security Officer.\nStyling: Default Modena (no CSS).");
        alert.showAndWait();
    }

    // Optional: helper methods to interact with included controllers
    public AccountantController getAccountantController() {
        return accountantController;
    }

    public SecurityOfficerController getSecurityController() {
        return securityController;
    }
}
