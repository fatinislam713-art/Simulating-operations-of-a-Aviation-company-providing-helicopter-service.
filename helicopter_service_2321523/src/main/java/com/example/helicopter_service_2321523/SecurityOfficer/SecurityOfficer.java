package com.example.helicopter_service_2321523.SecurityOfficer;

public class SecurityOfficer extends User {

    private String clearanceLevel;
    private String shiftTime;

    public SecurityOfficer(String userName, int userId, String password, String clearanceLevel, String shiftTime) {
        super(userName, userId, "SecurityOfficer", password);
        this.clearanceLevel = clearanceLevel;
        this.shiftTime = shiftTime;
    }

    // Getters
    public String getClearanceLevel() {
        return clearanceLevel;
    }

    public String getShiftTime() {
        return shiftTime;
    }

    // Setters
    public void setClearanceLevel(String clearanceLevel) {
        this.clearanceLevel = clearanceLevel;
    }

    public void setShiftTime(String shiftTime) {
        this.shiftTime = shiftTime;
    }
}
