package com.taskflow.application.port.out;

import com.taskflow.infrastructure.persistence.entity.Task;
import com.taskflow.presentation.dto.TaskDTO;

public interface TaskRepositoryPort {

    TaskDTO saveTask(Task task);

    TaskDTO getTask(Long taskId);
}
