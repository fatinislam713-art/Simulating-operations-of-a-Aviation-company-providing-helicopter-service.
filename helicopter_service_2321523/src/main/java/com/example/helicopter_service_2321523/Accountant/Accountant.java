package com.example.helicopter_service_2321523.Accountant;

public class Accountant extends User{

    private double salary;
    private String department;
    private String reportFrequency;

    public Accountant(String userName, int userId, String password, double salary, String department, String reportFrequency) {
        super(userName, userId, "Accountant", password);
        this.salary = salary;
        this.department = department;
        this.reportFrequency = reportFrequency;
    }

    public double getSalary() { return salary; }
    public String getDepartment() { return department; }
    public String getReportFrequency() { return reportFrequency; }
}