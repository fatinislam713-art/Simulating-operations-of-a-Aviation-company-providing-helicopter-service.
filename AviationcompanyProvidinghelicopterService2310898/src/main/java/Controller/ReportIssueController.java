package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ReportIssueController {
    @FXML private TextField aircraftIdField;
    @FXML private TextArea issueDescriptionArea;

    @FXML
    public void submitIssue() {
        String aircraftId = aircraftIdField.getText();
        String description = issueDescriptionArea.getText();
        System.out.println("Issue reported: " + aircraftId + " - " + description);
    }
}