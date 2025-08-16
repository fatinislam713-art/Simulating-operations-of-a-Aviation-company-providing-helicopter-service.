package Model;

import java.util.ArrayList;
import java.util.List;

public class FlightScheduler {
    private List<FlightEvent> schedule = new ArrayList<>();

    public void addFlight(FlightEvent event) {
        schedule.add(event);
    }

    public List<FlightEvent> getSchedule() {
        return schedule;
    }
}
