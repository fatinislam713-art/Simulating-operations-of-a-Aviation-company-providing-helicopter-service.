package Model;

import java.util.ArrayList;
import java.util.List;

public class MaintenanceHistory {
    private List<String> history = new ArrayList<>();

    public void addRecord(String record) {
        history.add(record);
    }

    public List<String> getHistory() {
        return history;
    }
}