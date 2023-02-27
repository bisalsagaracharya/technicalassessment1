package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
