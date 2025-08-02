package cse213.helicopterservice.TechnicalEngineer;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EmergencySupport {
    private String emergencyType;
    private String faultSystem;
    private String quickFixSuggestion;
    private String safetySystemStatus;
    private String emergencyTeamSupport;
    @javafx.fxml.FXML
    private TextField faultSystemField;
    @javafx.fxml.FXML
    private TextArea emergencyIssueArea;

    public EmergencySupport(String emergencyType, String faultSystem, String quickFixSuggestion, String safetySystemStatus, String emergencyTeamSupport) {
        this.emergencyType = emergencyType;
        this.faultSystem = faultSystem;
        this.quickFixSuggestion = quickFixSuggestion;
        this.safetySystemStatus = safetySystemStatus;
        this.emergencyTeamSupport = emergencyTeamSupport;
    }

    public String getEmergencyType() {
        return emergencyType;
    }

    public void setEmergencyType(String emergencyType) {
        this.emergencyType = emergencyType;
    }

    public String getFaultSystem() {
        return faultSystem;
    }

    public void setFaultSystem(String faultSystem) {
        this.faultSystem = faultSystem;
    }

    public String getQuickFixSuggestion() {
        return quickFixSuggestion;
    }

    public void setQuickFixSuggestion(String quickFixSuggestion) {
        this.quickFixSuggestion = quickFixSuggestion;
    }

    public String getSafetySystemStatus() {
        return safetySystemStatus;
    }

    public void setSafetySystemStatus(String safetySystemStatus) {
        this.safetySystemStatus = safetySystemStatus;
    }

    public String getEmergencyTeamSupport() {
        return emergencyTeamSupport;
    }

    public void setEmergencyTeamSupport(String emergencyTeamSupport) {
        this.emergencyTeamSupport = emergencyTeamSupport;
    }

    @Override
    public String toString() {
        return "EmergencySupport{" +
                "emergencyType='" + emergencyType + '\'' +
                ", faultSystem='" + faultSystem + '\'' +
                ", quickFixSuggestion='" + quickFixSuggestion + '\'' +
                ", safetySystemStatus='" + safetySystemStatus + '\'' +
                ", emergencyTeamSupport='" + emergencyTeamSupport + '\'' +
                '}';
    }

    @javafx.fxml.FXML
    public void handleSafetyCheckBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleTeamAssistBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleEmergencyResponseBtn(ActionEvent actionEvent) {
    }
}
