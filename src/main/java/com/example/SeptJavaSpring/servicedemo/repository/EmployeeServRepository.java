package com.example.SeptJavaSpring.servicedemo.repository;

import com.example.SeptJavaSpring.servicedemo.domain.EmployeeService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  EmployeeServRepository extends JpaRepository<EmployeeService,Integer> {
}
