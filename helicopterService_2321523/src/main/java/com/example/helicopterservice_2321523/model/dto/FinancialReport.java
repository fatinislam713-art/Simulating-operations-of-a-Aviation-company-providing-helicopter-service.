package com.example.helicopterservice_2321523.model.dto;


import java.time.LocalDate;

public class FinancialReport {
    private final String title;
    private final LocalDate periodEnd;
    private final double revenue;
    private final double opsCost;

    public FinancialReport(String title, LocalDate periodEnd, double revenue, double opsCost) {
        this.title = title;
        this.periodEnd = periodEnd;
        this.revenue = revenue;
        this.opsCost = opsCost;
    }

    public String summary() {
        return title + " (End: " + periodEnd + ") — Revenue: $" + revenue + ", OpsCost: $" + opsCost;
    }
}