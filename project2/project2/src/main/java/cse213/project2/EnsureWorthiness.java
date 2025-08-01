package cse213.project2;

import java.util.Date;
import java.util.Map;

public class EnsureWorthiness {
    private String helicopterID;
    private Date lastCheckDate;
    private Date nextScheduledService;
    private String faultReportID;
    private Map<String, Boolean> systemStatus;
    private Map<String, Double> fluidLevels;
    private String softwareVersion;
    private String airworthinessStatus;

    public EnsureWorthiness(String helicopterID, Date lastCheckDate, Date nextScheduledService, String faultReportID, Map<String, Boolean> systemStatus, Map<String, Double> fluidLevels, String softwareVersion, String airworthinessStatus) {
        this.helicopterID = helicopterID;
        this.lastCheckDate = lastCheckDate;
        this.nextScheduledService = nextScheduledService;
        this.faultReportID = faultReportID;
        this.systemStatus = systemStatus;
        this.fluidLevels = fluidLevels;
        this.softwareVersion = softwareVersion;
        this.airworthinessStatus = airworthinessStatus;
    }

    public String getHelicopterID() {
        return helicopterID;
    }

    public void setHelicopterID(String helicopterID) {
        this.helicopterID = helicopterID;
    }

    public Date getLastCheckDate() {
        return lastCheckDate;
    }

    public void setLastCheckDate(Date lastCheckDate) {
        this.lastCheckDate = lastCheckDate;
    }

    public Date getNextScheduledService() {
        return nextScheduledService;
    }

    public void setNextScheduledService(Date nextScheduledService) {
        this.nextScheduledService = nextScheduledService;
    }

    public String getFaultReportID() {
        return faultReportID;
    }

    public void setFaultReportID(String faultReportID) {
        this.faultReportID = faultReportID;
    }

    public Map<String, Boolean> getSystemStatus() {
        return systemStatus;
    }

    public void setSystemStatus(Map<String, Boolean> systemStatus) {
        this.systemStatus = systemStatus;
    }

    public Map<String, Double> getFluidLevels() {
        return fluidLevels;
    }

    public void setFluidLevels(Map<String, Double> fluidLevels) {
        this.fluidLevels = fluidLevels;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getAirworthinessStatus() {
        return airworthinessStatus;
    }

    public void setAirworthinessStatus(String airworthinessStatus) {
        this.airworthinessStatus = airworthinessStatus;
    }

    @Override
    public String toString() {
        return "EnsureWorthiness{" +
                "helicopterID='" + helicopterID + '\'' +
                ", lastCheckDate=" + lastCheckDate +
                ", nextScheduledService=" + nextScheduledService +
                ", faultReportID='" + faultReportID + '\'' +
                ", systemStatus=" + systemStatus +
                ", fluidLevels=" + fluidLevels +
                ", softwareVersion='" + softwareVersion + '\'' +
                ", airworthinessStatus='" + airworthinessStatus + '\'' +
                '}';
    }
}
