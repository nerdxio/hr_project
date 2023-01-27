package com.example.spring_data_jpa.repository;

import com.example.spring_data_jpa.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
