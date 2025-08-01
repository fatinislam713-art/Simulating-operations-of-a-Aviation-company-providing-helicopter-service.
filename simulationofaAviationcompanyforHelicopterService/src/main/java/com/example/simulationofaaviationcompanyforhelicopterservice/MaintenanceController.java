package com.example.simulationofaaviationcompanyforhelicopterservice;

import javafx.fxml.FXML;
import javafx.scene.control.cell.PropertyValueFactory;

public class MaintenanceController {
    package com.example.simulationofaviationcompanyforhelicopterservice;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

    public class MaintenanceController {

        @FXML
        private TableView<MaintenanceTask> maintenanceTable;

        @FXML
        private TableColumn<MaintenanceTask, String> taskIdColumn;

        @FXML
        private TableColumn<MaintenanceTask, String> descriptionColumn;

        @FXML
        private TableColumn<MaintenanceTask, String> statusColumn;

        @FXML
        public void initialize() {
            taskIdColumn.setCellValueFactory(new PropertyValueFactory<>("taskId"));
            descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
            statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

            ObservableList<MaintenanceTask> data = FXCollections.observableArrayList(
                    new MaintenanceTask("M001", "Engine Check", "Pending"),
                    new MaintenanceTask("M002", "Fuel System", "Completed")
            );

            maintenanceTable.setItems(data);
        }
    }

}
