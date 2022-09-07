package com.example.SeptJavaSpring.servicedemo.service;

import com.example.SeptJavaSpring.servicedemo.domain.EmployeeService;
import com.example.SeptJavaSpring.servicedemo.repository.EmployeeServRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface{


    @Autowired
    private EmployeeServRepository employeeServRepository;

    @Override
    public void saveEmployee(EmployeeService employeeService) {
        employeeServRepository.save(employeeService);
    }
}
