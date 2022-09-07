package com.example.SeptJavaSpring.servicedemo.controller;

import com.example.SeptJavaSpring.servicedemo.domain.EmployeeService;
import com.example.SeptJavaSpring.servicedemo.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeServController {

    @Autowired
    private EmployeeServiceImpl emp;

    @PostMapping("saveEmployeeService")
    public String saveEmployeeService(@RequestBody EmployeeService employeeService){
        emp.saveEmployee(employeeService);
        return "Employee saved..";
    }
}
