package Model;

public class TechnicalIssue {
    private String aircraftId;
    private String details;

    public TechnicalIssue(String aircraftId, String details) {
        this.aircraftId = aircraftId;
        this.details = details;
    }

    public String getAircraftId() { return aircraftId; }
    public void setAircraftId(String aircraftId) { this.aircraftId = aircraftId; }

    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }

    @Override
    public String toString() {
        return "Issue on " + aircraftId + ": " + details;
    }
}