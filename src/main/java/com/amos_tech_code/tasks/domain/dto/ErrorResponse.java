package com.amos_tech_code.tasks.domain.dto;

public record ErrorResponse(
        int status,
        String message,
        String details
) {
}
