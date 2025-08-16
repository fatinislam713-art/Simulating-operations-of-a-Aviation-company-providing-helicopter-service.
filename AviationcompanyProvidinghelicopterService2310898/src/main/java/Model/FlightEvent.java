package Model;

public class FlightEvent {
    private String flightId;
    private String route;
    private String dateTime;

    public FlightEvent(String flightId, String route, String dateTime) {
        this.flightId = flightId;
        this.route = route;
        this.dateTime = dateTime;
    }

    public String getFlightId() { return flightId; }
    public void setFlightId(String flightId) { this.flightId = flightId; }

    public String getRoute() { return route; }
    public void setRoute(String route) { this.route = route; }

    public String getDateTime() { return dateTime; }
    public void setDateTime(String dateTime) { this.dateTime = dateTime; }

    @Override
    public String toString() {
        return flightId + " - " + route + " @ " + dateTime;
    }
}