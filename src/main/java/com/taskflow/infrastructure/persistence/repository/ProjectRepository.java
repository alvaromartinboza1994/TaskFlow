package com.taskflow.infrastructure.persistence.repository;

import com.taskflow.infrastructure.persistence.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
