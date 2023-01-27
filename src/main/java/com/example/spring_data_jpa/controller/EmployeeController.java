package com.example.spring_data_jpa.controller;

import com.example.spring_data_jpa.model.Department;
import com.example.spring_data_jpa.model.Employee;
import com.example.spring_data_jpa.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService service ;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping
    public Long insert(@RequestBody Employee employee) {
       var inserted =  service.insert(employee);
        return inserted.getId();
    }

    @PutMapping
    public Employee update(@RequestBody Employee employee) {
        return service.update(employee);
    }

    @GetMapping("/department/{deptId}")
    public List<Employee>findByDepartment(@PathVariable Long deptId){
        return service.findByDepartment(deptId);
    }
}
