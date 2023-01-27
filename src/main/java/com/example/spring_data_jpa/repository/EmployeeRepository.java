package com.example.spring_data_jpa.repository;

import com.example.spring_data_jpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

    List<Employee>findByDepartment_Id(Long departmentId);
}
