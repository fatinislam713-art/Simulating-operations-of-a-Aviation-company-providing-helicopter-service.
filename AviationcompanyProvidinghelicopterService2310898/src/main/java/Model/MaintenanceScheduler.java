package Model;

import java.util.ArrayList;
import java.util.List;

public class MaintenanceScheduler {
    private List<MaintenanceTask> tasks = new ArrayList<>();

    public void addTask(MaintenanceTask task) {
        tasks.add(task);
    }

    public List<MaintenanceTask> getTasks() {
        return tasks;
    }
}