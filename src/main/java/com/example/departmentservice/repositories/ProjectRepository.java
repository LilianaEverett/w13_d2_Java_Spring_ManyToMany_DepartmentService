package com.example.departmentservice.repositories;

import com.example.departmentservice.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
