package cse213.helicopterservice.TechnicalEngineer;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MaintenanceRecords {
    private String maintenanceTaskId;
    private String helicopterId;
    private String description;
    private String datePerformed;
    private String technicianName;
    private String logbookEntry;
    private String reportFilePath;
    @javafx.fxml.FXML
    private TextArea maintenanceDescArea;
    @javafx.fxml.FXML
    private TextField taskIdField;
    @javafx.fxml.FXML
    private DatePicker workDatePicker;

    public MaintenanceRecords(String maintenanceTaskId, String helicopterId, String description, String datePerformed, String technicianName, String logbookEntry, String reportFilePath) {
        this.maintenanceTaskId = maintenanceTaskId;
        this.helicopterId = helicopterId;
        this.description = description;
        this.datePerformed = datePerformed;
        this.technicianName = technicianName;
        this.logbookEntry = logbookEntry;
        this.reportFilePath = reportFilePath;
    }

    public String getMaintenanceTaskId() {
        return maintenanceTaskId;
    }

    public void setMaintenanceTaskId(String maintenanceTaskId) {
        this.maintenanceTaskId = maintenanceTaskId;
    }

    public String getHelicopterId() {
        return helicopterId;
    }

    public void setHelicopterId(String helicopterId) {
        this.helicopterId = helicopterId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDatePerformed() {
        return datePerformed;
    }

    public void setDatePerformed(String datePerformed) {
        this.datePerformed = datePerformed;
    }

    public String getTechnicianName() {
        return technicianName;
    }

    public void setTechnicianName(String technicianName) {
        this.technicianName = technicianName;
    }

    public String getLogbookEntry() {
        return logbookEntry;
    }

    public void setLogbookEntry(String logbookEntry) {
        this.logbookEntry = logbookEntry;
    }

    public String getReportFilePath() {
        return reportFilePath;
    }

    public void setReportFilePath(String reportFilePath) {
        this.reportFilePath = reportFilePath;
    }

    @Override
    public String toString() {
        return "MaintenanceRecords{" +
                "maintenanceTaskId='" + maintenanceTaskId + '\'' +
                ", helicopterId='" + helicopterId + '\'' +
                ", description='" + description + '\'' +
                ", datePerformed='" + datePerformed + '\'' +
                ", technicianName='" + technicianName + '\'' +
                ", logbookEntry='" + logbookEntry + '\'' +
                ", reportFilePath='" + reportFilePath + '\'' +
                '}';
    }

    @javafx.fxml.FXML
    public void handleSaveRecordBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleUploadReportBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleReviewLogbookBtn(ActionEvent actionEvent) {
    }
}
