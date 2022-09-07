package com.example.SeptJavaSpring.composite.repository;

import com.example.SeptJavaSpring.composite.entity.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository extends JpaRepository<Gender,Long> {


}
