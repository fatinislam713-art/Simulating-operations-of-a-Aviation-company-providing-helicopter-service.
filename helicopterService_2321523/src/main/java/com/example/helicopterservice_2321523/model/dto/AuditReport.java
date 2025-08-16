package com.example.helicopterservice_2321523.model.dto;

import java.time.LocalDate;

public class AuditReport {
    private final LocalDate date;
    private final String scope;
    private final String finding;

    public AuditReport(LocalDate date, String scope, String finding) {
        this.date = date;
        this.scope = scope;
        this.finding = finding;
    }

    public String summary() {
        return "Audit " + date + " — " + scope + ": " + finding;
    }
}