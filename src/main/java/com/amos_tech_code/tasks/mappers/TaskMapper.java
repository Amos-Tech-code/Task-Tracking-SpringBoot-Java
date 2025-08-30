package com.amos_tech_code.tasks.mappers;

import com.amos_tech_code.tasks.domain.dto.TaskDto;
import com.amos_tech_code.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
