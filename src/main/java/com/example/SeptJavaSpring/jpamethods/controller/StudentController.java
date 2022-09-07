package com.example.SeptJavaSpring.jpamethods.controller;

import com.example.SeptJavaSpring.jpamethods.domain.Student;
import com.example.SeptJavaSpring.jpamethods.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("saveStudent")
    public String saveStudent(@RequestBody Student student) {
        studentRepository.save(student);
        return "Student saved";

    }
    @GetMapping("getStudent")
    public List<Student> getStudent(){

        return studentRepository.findAll();
    }

    @GetMapping("getStudentByName/{name}")
    public Student getStudent(@PathVariable("name")String name){

        return studentRepository.findByName(name);
    }

    @GetMapping("getStudentByNameAndAddress")
    public Student getStudent(@RequestParam String name,
                              @RequestParam String address){
        return studentRepository.findByNameAndAddress(name,address);
    }
}
