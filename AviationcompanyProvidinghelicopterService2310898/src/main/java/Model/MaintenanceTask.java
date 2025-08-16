package Model;

public class MaintenanceTask {
    private String aircraftId;
    private String description;

    public MaintenanceTask(String aircraftId, String description) {
        this.aircraftId = aircraftId;
        this.description = description;
    }

    public String getAircraftId() { return aircraftId; }
    public void setAircraftId(String aircraftId) { this.aircraftId = aircraftId; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        return aircraftId + ": " + description;
    }
}