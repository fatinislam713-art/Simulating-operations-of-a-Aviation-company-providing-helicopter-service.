package com.example.helicopterservice_2321523.model.dto;


public class PayrollRecord {
    private final String staffId;
    private final String role;
    private final double base;
    private final double hazard;
    private final double deductions;
    private final double net;

    public PayrollRecord(String staffId, String role, double base, double hazard, double deductions) {
        this.staffId = staffId;
        this.role = role;
        this.base = base;
        this.hazard = hazard;
        this.deductions = deductions;
        this.net = base + hazard - deductions;
    }

    public String toLine() {
        return staffId + " (" + role + ") — Net: $" + net;
    }
}