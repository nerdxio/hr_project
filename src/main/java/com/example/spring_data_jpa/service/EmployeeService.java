package com.example.spring_data_jpa.service;

import com.example.spring_data_jpa.model.Employee;
import com.example.spring_data_jpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Employee insert(Employee employee) {
        return repository.save(employee);
    }

    public Employee update(Employee employee) {
        Employee currentEmployee = repository.findById(employee.getId()).get();
        currentEmployee.setName(employee.getName());
        currentEmployee.setSalary(employee.getSalary());
        currentEmployee.setDepartment(employee.getDepartment());
        return repository.save(currentEmployee);
    }

    public List<Employee>findByDepartment(Long departmentId){
        return repository.findByDepartment_Id(departmentId);
    }
}
