package cse213.project2;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class MinimizeDowntimeController
{
    @javafx.fxml.FXML
    private TextField downtimeEstimateField;
    @javafx.fxml.FXML
    private TextField helicopterIdField;
    @javafx.fxml.FXML
    private TableView issueFieldTableView;
    @javafx.fxml.FXML
    private ComboBox repairStatusCombo;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleResolveProblem(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleVerifySafety(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleRunDiagnostics(ActionEvent actionEvent) {
    }
}