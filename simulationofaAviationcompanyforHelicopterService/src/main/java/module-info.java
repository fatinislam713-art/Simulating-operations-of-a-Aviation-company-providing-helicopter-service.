module com.example.simulationofaaviationcompanyforhelicopterservice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulationofaaviationcompanyforhelicopterservice to javafx.fxml;
    exports com.example.simulationofaaviationcompanyforhelicopterservice;
}