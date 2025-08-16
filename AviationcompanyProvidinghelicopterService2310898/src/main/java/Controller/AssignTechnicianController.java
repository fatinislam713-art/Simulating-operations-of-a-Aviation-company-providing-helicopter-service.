package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AssignTechnicianController {

    @FXML private TextField aircraftIdField;
    @FXML private TextArea taskDescriptionArea;
    @FXML private ComboBox<String> technicianCombo;

    @FXML
    public void initialize() {
        // Example list of technicians
        technicianCombo.getItems().addAll(
                "John - Engine Specialist",
                "Ali - Rotor Specialist",
                "Mehedi - Electrical Systems"
        );
    }

    @FXML
    public void assignTask() {
        String aircraftId = aircraftIdField.getText();
        String taskDescription = taskDescriptionArea.getText();
        String technician = technicianCombo.getValue();

        if (aircraftId.isEmpty() || taskDescription.isEmpty() || technician == null) {
            System.out.println("Please fill all fields before assigning a task.");
            return;
        }

        System.out.println("Task assigned:");
        System.out.println("Aircraft: " + aircraftId);
        System.out.println("Task: " + taskDescription);
        System.out.println("Technician: " + technician);
    }
}
