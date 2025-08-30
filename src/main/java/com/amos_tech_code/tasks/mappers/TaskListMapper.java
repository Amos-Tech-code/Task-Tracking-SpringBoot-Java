package com.amos_tech_code.tasks.mappers;

import com.amos_tech_code.tasks.domain.dto.TaskListDto;
import com.amos_tech_code.tasks.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
