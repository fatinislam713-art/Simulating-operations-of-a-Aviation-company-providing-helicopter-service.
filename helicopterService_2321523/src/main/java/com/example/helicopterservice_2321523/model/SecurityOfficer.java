package com.example.helicopterservice_2321523.model;


import com.example.helicopterservice_2321523.model.dto.AuditReport;
import com.example.helicopterservice_2321523.model.dto.SecurityLog;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SecurityOfficer extends User {

    public SecurityOfficer(String id, String name) {
        super(id, name, "SecurityOfficer");
    }

    // Goal 1
    public String monitorHelipads() {
        return "Monitoring helipads via CCTV feeds and active patrols.";
    }

    public String verifyIdAndClearance() {
        return "Verified IDs and clearances for all helipad entrants.";
    }

    public String baggageCheckBeforeBoarding() {
        return "Performed baggage checks before boarding.";
    }

    public SecurityLog reportUnauthorizedAccessAttempt() {
        return new SecurityLog(LocalDateTime.now(), "Unauthorized access attempt detected at Gate H2", "HIGH");
    }

    // Goal 2
    public String conductPreFlightSecurityBriefing() {
        return "Conducted pre-flight security briefing for crew and passengers.";
    }

    public String superviseBoardingAndProtocols() {
        return "Supervised boarding; safety protocols followed.";
    }

    public String handleEmergenciesDuringBoarding() {
        return "Handled suspicious activity; coordinated with ops and resolved.";
    }

    public String logActivitiesAndHandover() {
        return "Logged security activities and completed shift handover.";
    }

    // Goal 3
    public String reviewUpdatedSecurityGuidelines() {
        return "Reviewed latest aviation security guidelines from authorities.";
    }

    public AuditReport conductRoutineSecurityAudits() {
        return new AuditReport(LocalDate.now(), "Helipad Operations", "Compliant, minor improvements suggested.");
    }

    public String trainStaffOnSecurityProtocols() {
        return "Trained ground staff and crew on updated security protocols.";
    }

    public String submitAuditReportsToBoard() {
        return "Submitted audit reports to the aviation safety board.";
    }

    // Goal 4
    public String issueAccessBadges() {
        return "Issued access badges to authorized personnel.";
    }

    public String checkAccessLogsAndCCTV() {
        return "Checked access logs and reviewed CCTV footage.";
    }

    public String revokeExpiredOrSuspendedCredentials() {
        return "Revoked expired and suspended credentials.";
    }

    public String conductSurpriseInspections() {
        return "Conducted surprise inspections at restricted entry points.";
    }

    // Goal 5
    public String testAlarmAndCommsSystems() {
        return "Tested alarm systems and emergency communication devices.";
    }

    public String inspectFireExtinguishersAndScanners() {
        return "Inspected fire extinguishers, metal detectors, and scanners.";
    }

    public String logEquipmentStatusAndRequestReplacements() {
        return "Logged equipment status; requested replacements where needed.";
    }

    public String replaceOrRepairSurveillanceGear() {
        return "Repaired/replaced malfunctioning surveillance and safety gear.";
    }

    public String calibrateDetectorsAndScanners() {
        return "Calibrated metal detectors and scanner equipment.";
    }
}
