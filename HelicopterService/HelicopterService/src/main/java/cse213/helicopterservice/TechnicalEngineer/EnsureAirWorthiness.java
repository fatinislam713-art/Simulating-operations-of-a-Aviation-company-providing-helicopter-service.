package cse213.helicopterservice.TechnicalEngineer;

public class EnsureAirWorthiness {
    private String helicopterId;
    private String faultReportId;
    private String systemStatus;
    private String softwareVersion;
    private String repairStatus;
    private String downtimeEstimate;
    private String nextServiceDate;
    private String lastCheckDate;

    public EnsureAirWorthiness(String helicopterId, String faultReportId, String systemStatus, String softwareVersion, String repairStatus, String downtimeEstimate, String nextServiceDate, String lastCheckDate) {
        this.helicopterId = helicopterId;
        this.faultReportId = faultReportId;
        this.systemStatus = systemStatus;
        this.softwareVersion = softwareVersion;
        this.repairStatus = repairStatus;
        this.downtimeEstimate = downtimeEstimate;
        this.nextServiceDate = nextServiceDate;
        this.lastCheckDate = lastCheckDate;
    }

    public String getHelicopterId() {
        return helicopterId;
    }

    public void setHelicopterId(String helicopterId) {
        this.helicopterId = helicopterId;
    }

    public String getFaultReportId() {
        return faultReportId;
    }

    public void setFaultReportId(String faultReportId) {
        this.faultReportId = faultReportId;
    }

    public String getSystemStatus() {
        return systemStatus;
    }

    public void setSystemStatus(String systemStatus) {
        this.systemStatus = systemStatus;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus;
    }

    public String getDowntimeEstimate() {
        return downtimeEstimate;
    }

    public void setDowntimeEstimate(String downtimeEstimate) {
        this.downtimeEstimate = downtimeEstimate;
    }

    public String getNextServiceDate() {
        return nextServiceDate;
    }

    public void setNextServiceDate(String nextServiceDate) {
        this.nextServiceDate = nextServiceDate;
    }

    public String getLastCheckDate() {
        return lastCheckDate;
    }

    public void setLastCheckDate(String lastCheckDate) {
        this.lastCheckDate = lastCheckDate;
    }

    @Override
    public String toString() {
        return "EnsureAirWorthiness{" +
                "helicopterId='" + helicopterId + '\'' +
                ", faultReportId='" + faultReportId + '\'' +
                ", systemStatus='" + systemStatus + '\'' +
                ", softwareVersion='" + softwareVersion + '\'' +
                ", repairStatus='" + repairStatus + '\'' +
                ", downtimeEstimate='" + downtimeEstimate + '\'' +
                ", nextServiceDate='" + nextServiceDate + '\'' +
                ", lastCheckDate='" + lastCheckDate + '\'' +
                '}';
    }
}
