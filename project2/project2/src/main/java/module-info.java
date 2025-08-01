module cse213.project2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens cse213.project2 to javafx.fxml;
    exports cse213.project2;
}