package com.taskflow.presentation.dto;

import com.taskflow.model.enums.TaskPriority;
import com.taskflow.model.enums.TaskStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TaskDTO {

    private String title;

    private String description;

    private TaskStatus status;

    private TaskPriority priority;

}
