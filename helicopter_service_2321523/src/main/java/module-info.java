module com.example.helicopter_service_2321523 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helicopter_service_2321523 to javafx.fxml;
    opens com.example.helicopter_service_2321523.Accountant to javafx.fxml, javafx.base;
    opens com.example.helicopter_service_2321523.SecurityOfficer to javafx.fxml, javafx.base;
    exports com.example.helicopter_service_2321523;
}