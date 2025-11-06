package com.taskflow.infrastructure.persistence.mapper;

import com.taskflow.infrastructure.persistence.entity.Project;
import com.taskflow.presentation.dto.ProjectDTO;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface ProjectDataMapper {

    ProjectDTO toDTO(Project project);

    Project toEntity(ProjectDTO projectDTO);

}
