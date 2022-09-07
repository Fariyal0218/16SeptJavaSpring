package com.example.SeptJavaSpring.jpamethods.repository;

import com.example.SeptJavaSpring.jpamethods.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    Student findByName(String name);

     Student findByNameAndAddress(String name,String address);

}
