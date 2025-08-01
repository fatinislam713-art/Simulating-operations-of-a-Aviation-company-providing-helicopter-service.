package cse213.project2;

public class MinimizeDowntime {
    private String helicopterId;
    private String currentIssue;
    private String repairStatus;
    private String estimatedDowntime;

    public MinimizeDowntime(String helicopterId, String currentIssue, String repairStatus, String estimatedDowntime) {
        this.helicopterId = helicopterId;
        this.currentIssue = currentIssue;
        this.repairStatus = repairStatus;
        this.estimatedDowntime = estimatedDowntime;
    }

    public String getHelicopterId() {
        return helicopterId;
    }

    public void setHelicopterId(String helicopterId) {
        this.helicopterId = helicopterId;
    }

    public String getCurrentIssue() {
        return currentIssue;
    }

    public void setCurrentIssue(String currentIssue) {
        this.currentIssue = currentIssue;
    }

    public String getRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus;
    }

    public String getEstimatedDowntime() {
        return estimatedDowntime;
    }

    public void setEstimatedDowntime(String estimatedDowntime) {
        this.estimatedDowntime = estimatedDowntime;
    }

    @Override
    public String toString() {
        return "MinimizeDowntime{" +
                "helicopterId='" + helicopterId + '\'' +
                ", currentIssue='" + currentIssue + '\'' +
                ", repairStatus='" + repairStatus + '\'' +
                ", estimatedDowntime='" + estimatedDowntime + '\'' +
                '}';
    }
}
