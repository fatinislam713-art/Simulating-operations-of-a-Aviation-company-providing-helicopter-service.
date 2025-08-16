package com.example.helicopterservice_2321523.controller;

import com.example.helicopterservice_2321523.model.SecurityOfficer;
import com.example.helicopterservice_2321523.model.dto.AuditReport;
import com.example.helicopterservice_2321523.model.dto.SecurityLog;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SecurityOfficerController {

    @FXML private TextField txtOfficerName;
    @FXML private TextField txtOfficerId;
    @FXML private TextArea txtOutput;

    private SecurityOfficer officer;

    @FXML
    private void onInitUser() {
        String name = txtOfficerName.getText().isBlank() ? "Officer S" : txtOfficerName.getText();
        String id = txtOfficerId.getText().isBlank() ? "SEC-101" : txtOfficerId.getText();
        this.officer = new SecurityOfficer(id, name);
        log("Initialized Security Officer: " + name + " [" + id + "]");
    }

    private void ensureUser() {
        if (officer == null) {
            this.officer = new SecurityOfficer("SEC-101", "Officer S");
        }
    }

    private void log(String msg) {
        txtOutput.appendText(msg + System.lineSeparator());
    }

    // Goal 1
    @FXML private void onMonitorHelipad() {
        ensureUser();
        log(officer.monitorHelipads());
    }

    @FXML private void onVerifyAccess() {
        ensureUser();
        log(officer.verifyIdAndClearance());
    }

    @FXML private void onBaggageInspection() {
        ensureUser();
        log(officer.baggageCheckBeforeBoarding());
    }

    @FXML private void onReportUnauthorizedAccess() {
        ensureUser();
        SecurityLog logObj = officer.reportUnauthorizedAccessAttempt();
        log("Reported: " + logObj.summary());
    }

    // Goal 2
    @FXML private void onPreFlightBriefing() {
        ensureUser();
        log(officer.conductPreFlightSecurityBriefing());
    }

    @FXML private void onSuperviseBoarding() {
        ensureUser();
        log(officer.superviseBoardingAndProtocols());
    }

    @FXML private void onHandleEmergencies() {
        ensureUser();
        log(officer.handleEmergenciesDuringBoarding());
    }

    @FXML private void onLogAndHandover() {
        ensureUser();
        log(officer.logActivitiesAndHandover());
    }

    // Goal 3
    @FXML private void onReviewGuidelines() {
        ensureUser();
        log(officer.reviewUpdatedSecurityGuidelines());
    }

    @FXML private void onConductAudits() {
        ensureUser();
        AuditReport report = officer.conductRoutineSecurityAudits();
        log("Audit: " + report.summary());
    }

    @FXML private void onConductTraining() {
        ensureUser();
        log(officer.trainStaffOnSecurityProtocols());
    }

    @FXML private void onSubmitAuditReports() {
        ensureUser();
        log(officer.submitAuditReportsToBoard());
    }

    // Goal 4
    @FXML private void onIssueBadges() {
        ensureUser();
        log(officer.issueAccessBadges());
    }

    @FXML private void onCheckAccessLogs() {
        ensureUser();
        log(officer.checkAccessLogsAndCCTV());
    }

    @FXML private void onRevokeAccess() {
        ensureUser();
        log(officer.revokeExpiredOrSuspendedCredentials());
    }

    @FXML private void onSurpriseInspections() {
        ensureUser();
        log(officer.conductSurpriseInspections());
    }

    // Goal 5
    @FXML private void onTestAlarms() {
        ensureUser();
        log(officer.testAlarmAndCommsSystems());
    }

    @FXML private void onInspectEquipment() {
        ensureUser();
        log(officer.inspectFireExtinguishersAndScanners());
    }

    @FXML private void onLogEquipmentStatus() {
        ensureUser();
        log(officer.logEquipmentStatusAndRequestReplacements());
    }

    @FXML private void onRepairGear() {
        ensureUser();
        log(officer.replaceOrRepairSurveillanceGear());
    }

    @FXML private void onCalibrateScanners() {
        ensureUser();
        log(officer.calibrateDetectorsAndScanners());
    }
}
