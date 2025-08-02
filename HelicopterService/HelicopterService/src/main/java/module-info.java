module cse213.helicopterservice {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.helicopterservice to javafx.fxml;
    opens cse213.helicopterservice.TechnicalEngineer to javafx.fxml,javafx.base;
    opens cse213.helicopterservice.FinanceOfficer to javafx.fxml,javafx.base;
    exports cse213.helicopterservice;
}