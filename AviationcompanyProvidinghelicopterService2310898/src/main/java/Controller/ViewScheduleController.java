package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;

public class ViewScheduleController {
    @FXML private TableView<?> flightTable;
    @FXML private TableColumn<?, ?> colDate;
    @FXML private TableColumn<?, ?> colRoute;

    @FXML
    public void initialize() {
        // Load schedule data
    }
}