package com.example.spring_data_jpa.service;

import com.example.spring_data_jpa.model.Department;
import com.example.spring_data_jpa.model.Employee;
import com.example.spring_data_jpa.repository.DepartmentRepository;
import com.example.spring_data_jpa.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private final DepartmentRepository repository;

    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

    public Department findById(Long id){
        return repository.findById(id).orElseThrow();
    }

    public Department insert(Department department) {
        return repository.save(department);
    }

    public Department update(Department department) {
        Department currentDepartment = repository.findById(department.getId()).get();
        currentDepartment.setName(department.getName());
        return repository.save(currentDepartment);
    }

}
