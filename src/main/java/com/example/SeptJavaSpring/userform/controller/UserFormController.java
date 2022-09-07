package com.example.SeptJavaSpring.userform.controller;

import com.example.SeptJavaSpring.userform.domain.UserForm;
import com.example.SeptJavaSpring.userform.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserFormController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("saveUserForm")
    public String saveUser(@RequestBody UserForm user){
        userRepo.save(user);
        return "user saved...";
    }
}
