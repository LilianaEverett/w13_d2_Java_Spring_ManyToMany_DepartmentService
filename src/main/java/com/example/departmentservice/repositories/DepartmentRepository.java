package com.example.departmentservice.repositories;

import com.example.departmentservice.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
