package com.amos_tech_code.tasks.domain.dto;

import com.amos_tech_code.tasks.domain.entities.TaskPriority;
import com.amos_tech_code.tasks.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
