package com.example.SeptJavaSpring.lombokdemo.repository;

import com.example.SeptJavaSpring.lombokdemo.domain.LombokDemo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LombokRepo extends JpaRepository<LombokDemo,Integer> {


}
