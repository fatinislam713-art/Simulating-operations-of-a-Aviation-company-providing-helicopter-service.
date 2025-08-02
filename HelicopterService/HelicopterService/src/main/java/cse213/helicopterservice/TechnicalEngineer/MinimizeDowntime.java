package cse213.helicopterservice.TechnicalEngineer;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MinimizeDowntime {
    private String landingGearStatus;
    private String rotorBladeCondition;
    private String sensorStatus;
    private String replacedPartName;
    private String batteryStatus;
    @javafx.fxml.FXML
    private TextArea faultDetailsArea;
    @javafx.fxml.FXML
    private TextField landingGearField;
    @javafx.fxml.FXML
    private TextField rotorBladeField;

    public MinimizeDowntime(String landingGearStatus, String rotorBladeCondition, String sensorStatus, String replacedPartName, String batteryStatus) {
        this.landingGearStatus = landingGearStatus;
        this.rotorBladeCondition = rotorBladeCondition;
        this.sensorStatus = sensorStatus;
        this.replacedPartName = replacedPartName;
        this.batteryStatus = batteryStatus;
    }

    public String getLandingGearStatus() {
        return landingGearStatus;
    }

    public void setLandingGearStatus(String landingGearStatus) {
        this.landingGearStatus = landingGearStatus;
    }

    public String getRotorBladeCondition() {
        return rotorBladeCondition;
    }

    public void setRotorBladeCondition(String rotorBladeCondition) {
        this.rotorBladeCondition = rotorBladeCondition;
    }

    public String getSensorStatus() {
        return sensorStatus;
    }

    public void setSensorStatus(String sensorStatus) {
        this.sensorStatus = sensorStatus;
    }

    public String getReplacedPartName() {
        return replacedPartName;
    }

    public void setReplacedPartName(String replacedPartName) {
        this.replacedPartName = replacedPartName;
    }

    public String getBatteryStatus() {
        return batteryStatus;
    }

    public void setBatteryStatus(String batteryStatus) {
        this.batteryStatus = batteryStatus;
    }

    @Override
    public String toString() {
        return "MinimizeDowntime{" +
                "landingGearStatus='" + landingGearStatus + '\'' +
                ", rotorBladeCondition='" + rotorBladeCondition + '\'' +
                ", sensorStatus='" + sensorStatus + '\'' +
                ", replacedPartName='" + replacedPartName + '\'' +
                ", batteryStatus='" + batteryStatus + '\'' +
                '}';
    }

    @javafx.fxml.FXML
    public void handleVisualCheckBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleBatteryTestBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleReplacePartBtn(ActionEvent actionEvent) {
    }
}
