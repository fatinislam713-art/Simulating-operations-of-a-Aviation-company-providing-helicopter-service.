package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MaintenanceHistoryController {

    @FXML private TableView<String> maintenanceTable;
    @FXML private TableColumn<String, String> colRecord;

    @FXML
    public void initialize() {
        ObservableList<String> historyData = FXCollections.observableArrayList(
                "2025-01-10 - Aircraft A1 - Engine inspection - Technician John",
                "2025-02-05 - Aircraft B2 - Rotor blade replacement - Technician Ali"
        );
        maintenanceTable.setItems(historyData);
    }
}