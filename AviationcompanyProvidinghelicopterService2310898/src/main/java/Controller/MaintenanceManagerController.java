package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class MaintenanceManagerController {

    @FXML private Button scheduleMaintenanceButton;
    @FXML private Button viewHistoryButton;
    @FXML private Button assignTechnicianButton;

    @FXML
    public void openScheduleMaintenance() throws Exception {
        loadScene("/View/ScheduleMaintenance.fxml");
    }

    @FXML
    public void openMaintenanceHistory() throws Exception {
        loadScene("/View/MaintenanceHistory.fxml");
    }

    @FXML
    public void openAssignTechnician() throws Exception {
        loadScene("/View/AssignTechnician.fxml");
    }

    private void loadScene(String fxmlPath) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
        Stage stage = (Stage) scheduleMaintenanceButton.getScene().getWindow();
        stage.setScene(new Scene(loader.load()));
    }
}