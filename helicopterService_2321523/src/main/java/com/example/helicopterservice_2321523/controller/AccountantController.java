package com.example.helicopterservice_2321523.controller;

import com.example.helicopterservice_2321523.model.Accountant;
import com.example.helicopterservice_2321523.model.dto.FinancialReport;
import com.example.helicopterservice_2321523.model.dto.PayrollRecord;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.List;

public class AccountantController {

    @FXML private TextField txtAccountantName;
    @FXML private TextField txtAccountantId;
    @FXML private TextArea txtOutput;

    private Accountant accountant;

    @FXML
    private void onInitUser() {
        String name = txtAccountantName.getText().isBlank() ? "Accountant A" : txtAccountantName.getText();
        String id = txtAccountantId.getText().isBlank() ? "ACC-001" : txtAccountantId.getText();
        this.accountant = new Accountant(id, name);
        log("Initialized Accountant: " + name + " [" + id + "]");
    }

    private void ensureUser() {
        if (accountant == null) {
            this.accountant = new Accountant("ACC-001", "Accountant A");
        }
    }

    private void log(String msg) {
        txtOutput.appendText(msg + System.lineSeparator());
    }

    // Goal 1
    @FXML private void onCollectTransactionData() {
        ensureUser();
        List<String> tx = accountant.collectTransactionData();
        log("Collected transactions: " + tx.size() + " entries.");
    }

    @FXML private void onGenerateIncomeAndOpsCost() {
        ensureUser();
        FinancialReport report = accountant.generateIncomeAndOpsCostReports();
        log("Generated report: " + report.summary());
    }

    @FXML private void onConductInternalReviews() {
        ensureUser();
        String result = accountant.conductInternalFinancialReviews();
        log(result);
    }

    @FXML private void onSubmitMonthlyReports() {
        ensureUser();
        String result = accountant.submitMonthlyReportsToFinanceManager();
        log(result);
    }

    // Goal 2
    @FXML private void onCollectShiftLogs() {
        ensureUser();
        String result = accountant.collectShiftLogsAndAttendance();
        log(result);
    }

    @FXML private void onComputePayroll() {
        ensureUser();
        List<PayrollRecord> records = accountant.calculateSalariesHazardAndDeductions();
        log("Computed payroll for " + records.size() + " staff.");
    }

    @FXML private void onGeneratePayslips() {
        ensureUser();
        String result = accountant.generatePayslipsAndTaxForms();
        log(result);
    }

    @FXML private void onRequestPayrollApproval() {
        ensureUser();
        String result = accountant.requestPayrollApproval();
        log(result);
    }

    @FXML private void onExecutePayrollTransfer() {
        ensureUser();
        String result = accountant.transferSalariesAndBonuses();
        log(result);
    }

    // Goal 3
    @FXML private void onBudgetReview() {
        ensureUser();
        String result = accountant.reviewPreviousBudgetAndActuals();
        log(result);
    }

    @FXML private void onBudgetCollectForecasts() {
        ensureUser();
        String result = accountant.collectForecastsFromDepartments();
        log(result);
    }

    @FXML private void onBudgetDraftProposals() {
        ensureUser();
        String result = accountant.draftBudgetProposals();
        log(result);
    }

    @FXML private void onBudgetFinalizeAndSubmit() {
        ensureUser();
        String result = accountant.finalizeAndSubmitAnnualBudget();
        log(result);
    }

    // Goal 4
    @FXML private void onOpsCostRecordExpenses() {
        ensureUser();
        String result = accountant.recordOperationalExpenses();
        log(result);
    }

    @FXML private void onOpsCostAllocate() {
        ensureUser();
        String result = accountant.allocateCostsByDimension();
        log(result);
    }

    @FXML private void onOpsCostCreateReports() {
        ensureUser();
        String result = accountant.createDetailedCostReports();
        log(result);
    }

    @FXML private void onOpsCostPresentReports() {
        ensureUser();
        String result = accountant.presentReportsToOpsManagement();
        log(result);
    }
}