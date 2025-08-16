
module com.example.helicopterservice_2321523 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helicopterservice_2321523 to javafx.fxml;
    opens com.example.helicopterservice_2321523.model.dto to javafx.base;

    exports com.example.helicopterservice_2321523;
    exports com.example.helicopterservice_2321523.controller;
    exports com.example.helicopterservice_2321523.model;
}
