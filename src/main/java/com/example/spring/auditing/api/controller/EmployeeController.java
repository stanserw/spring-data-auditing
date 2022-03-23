package com.example.spring.auditing.api.controller;

import com.example.spring.auditing.api.dto.InputRequest;
import com.example.spring.auditing.api.model.Employee;
import com.example.spring.auditing.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/addEmployee")
    public String saveEmployee(@RequestBody InputRequest<Employee> request) {
        return service.saveEmployee(request);
    }

    @PutMapping("/updateEmployee/{id}/{salary}")
    public String updateEmployeeSalary(@PathVariable int id, @PathVariable double salary,
                                       @RequestBody InputRequest<Employee> request) {
        return service.updateEmployee(id, salary, request);
    }
}
