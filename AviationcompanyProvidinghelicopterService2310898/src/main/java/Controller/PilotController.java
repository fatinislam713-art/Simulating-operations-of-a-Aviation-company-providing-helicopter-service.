package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class PilotController {

    @FXML private Button flightPlanButton;
    @FXML private Button viewScheduleButton;
    @FXML private Button reportIssueButton;
    @FXML private Button emergencyButton;

    @FXML
    public void openFlightPlan() throws Exception {
        loadScene("/View/FlightPlan.fxml");
    }

    @FXML
    public void openViewSchedule() throws Exception {
        loadScene("/View/ViewSchedule.fxml");
    }

    @FXML
    public void openReportIssue() throws Exception {
        loadScene("/View/ReportIssue.fxml");
    }

    @FXML
    public void openEmergencyProtocol() throws Exception {
        loadScene("/View/EmergencyProtocol.fxml");
    }

    private void loadScene(String fxmlPath) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
        Stage stage = (Stage) flightPlanButton.getScene().getWindow();
        stage.setScene(new Scene(loader.load()));
    }
}