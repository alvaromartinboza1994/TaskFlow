package com.taskflow.infrastructure.adapter;

import com.taskflow.application.port.out.TaskRepositoryPort;
import com.taskflow.domain.exception.TaskNotFoundException;
import com.taskflow.infrastructure.persistence.entity.Task;
import com.taskflow.infrastructure.persistence.mapper.TaskDataMapper;
import com.taskflow.infrastructure.persistence.repository.TaskRepository;
import com.taskflow.presentation.dto.TaskDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@Slf4j
@AllArgsConstructor
public class TaskAdapter implements TaskRepositoryPort {

    private final TaskRepository taskRepository;

    private final TaskDataMapper taskDataMapper;

    @Override
    public TaskDTO saveTask(Task task) {
        Objects.requireNonNull(task, "Can not persist a null task");
        return taskDataMapper.toDTO(taskRepository.save(task));
    }

    @Override
    public TaskDTO getTask(Long taskId) {
        final Task task = taskRepository.findById(taskId).orElseThrow(() -> new TaskNotFoundException(taskId));
        return taskDataMapper.toDTO(task);
    }
}
