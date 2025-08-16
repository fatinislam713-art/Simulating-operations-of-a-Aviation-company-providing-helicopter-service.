package com.example.helicopterservice_2321523.model.dto;


import java.time.LocalDateTime;

public class SecurityLog {
    private final LocalDateTime time;
    private final String description;
    private final String severity;

    public SecurityLog(LocalDateTime time, String description, String severity) {
        this.time = time;
        this.description = description;
        this.severity = severity;
    }

    public String summary() {
        return "[" + time + "] (" + severity + ") " + description;
    }
}