package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class EmergencyProtocolController {

    @FXML private ComboBox<String> protocolTypeBox;
    @FXML private TextArea instructionsArea;

    @FXML
    public void initialize() {
        // Add some example protocol types
        protocolTypeBox.getItems().addAll(
                "Engine Failure",
                "Medical Emergency",
                "Weather Diversion",
                "Fuel Shortage"
        );

        // Show instructions when a protocol is selected
        protocolTypeBox.setOnAction(e -> {
            String selected = protocolTypeBox.getValue();
            if (selected != null) {
                instructionsArea.setText("Instructions for: " + selected + "\nFollow all safety steps and inform ATC immediately.");
            }
        });
    }

    @FXML
    public void activateProtocol() {
        String selected = protocolTypeBox.getValue();
        if (selected != null) {
            System.out.println("Emergency Protocol Activated: " + selected);
        } else {
            System.out.println("Please select a protocol first.");
        }
    }
}
