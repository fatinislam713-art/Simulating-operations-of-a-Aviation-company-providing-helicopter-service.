package com.example.helicopterservice_2321523.model;


import com.example.helicopterservice_2321523.model.dto.FinancialReport;
import com.example.helicopterservice_2321523.model.dto.PayrollRecord;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Accountant extends User {

    public Accountant(String id, String name) {
        super(id, name, "Accountant");
    }

    // Goal 1
    public List<String> collectTransactionData() {
        // Simulated data collection
        List<String> tx = new ArrayList<>();
        tx.add("Fuel purchase - $12,000");
        tx.add("Client charter income - $55,000");
        tx.add("Maintenance parts - $7,600");
        return tx;
    }

    public FinancialReport generateIncomeAndOpsCostReports() {
        double revenue = 55000 + 42000; // sample
        double opsCost = 12000 + 7600 + 9000;
        return new FinancialReport("Monthly Income & Ops Cost", LocalDate.now(), revenue, opsCost);
    }

    public String conductInternalFinancialReviews() {
        return "Internal review completed — no critical discrepancies found.";
    }

    public String submitMonthlyReportsToFinanceManager() {
        return "Monthly reports submitted to Finance Manager.";
    }

    // Goal 2
    public String collectShiftLogsAndAttendance() {
        return "Collected shift logs from pilots, engineers, and ground crew.";
    }

    public List<PayrollRecord> calculateSalariesHazardAndDeductions() {
        List<PayrollRecord> list = new ArrayList<>();
        list.add(new PayrollRecord("P-001", "Pilot", 8000, 1200, 800));
        list.add(new PayrollRecord("E-101", "Engineer", 6000, 600, 500));
        list.add(new PayrollRecord("G-501", "Ground Crew", 3500, 300, 200));
        return list;
    }

    public String generatePayslipsAndTaxForms() {
        return "Payslips and tax forms generated for all staff.";
    }

    public String requestPayrollApproval() {
        return "Payroll batch sent to HR/Operations Director for approval.";
    }

    public String transferSalariesAndBonuses() {
        return "Salary and bonus transfers executed successfully.";
    }

    // Goal 3
    public String reviewPreviousBudgetAndActuals() {
        return "Reviewed last year's budget against actuals; identified variance of 4.3%.";
    }

    public String collectForecastsFromDepartments() {
        return "Collected forecasts from Ops, Maintenance, and HR.";
    }

    public String draftBudgetProposals() {
        return "Drafted budget proposals for helicopter fleet and staffing.";
    }

    public String finalizeAndSubmitAnnualBudget() {
        return "Annual budget finalized and submitted.";
    }

    // Goal 4
    public String recordOperationalExpenses() {
        return "Recorded expenses: fuel, maintenance, flight hours.";
    }

    public String allocateCostsByDimension() {
        return "Allocated costs by helicopter, route, and client.";
    }

    public String createDetailedCostReports() {
        return "Created detailed cost reports for each aircraft.";
    }

    public String presentReportsToOpsManagement() {
        return "Presented operational cost reports to Operations Management.";
    }
}
