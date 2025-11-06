package com.taskflow.infrastructure.persistence.mapper;

import com.taskflow.infrastructure.persistence.entity.Task;
import com.taskflow.presentation.dto.TaskDTO;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface TaskDataMapper {

    TaskDTO toDTO(Task task);

    Task toEntity(TaskDTO taskDTO);

}
