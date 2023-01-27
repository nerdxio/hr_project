package com.example.spring_data_jpa.controller;

import com.example.spring_data_jpa.model.Department;
import com.example.spring_data_jpa.model.Employee;
import com.example.spring_data_jpa.service.DepartmentService;
import com.example.spring_data_jpa.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentService service ;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping
    public Department insert(@RequestBody Department department) {
        return service.insert(department);
    }

    @PutMapping
    public Department update(@RequestBody Department department) {
        return service.update(department);
    }

    @GetMapping
    public List<Department> findAll(){
        return service.findAll();
    }
}
