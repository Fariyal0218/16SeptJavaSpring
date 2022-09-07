package com.example.SeptJavaSpring.onetoone.controller;


import com.example.SeptJavaSpring.onetoone.domain.User;
import com.example.SeptJavaSpring.onetoone.repository.AddressRepository;
import com.example.SeptJavaSpring.onetoone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController{

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("saveUser")
    public String saveUser(@RequestBody User user){
//        User user = new User();
//        user.setName("Rahul");
//
//        Address address = new Address();
//        address.setAddress("Pune");
//        address.setPinCode(34343);
//
//        user.setAddress(address);
//        address.setUser(user);

        userRepository.save(user);
//        addressRepository.save(address);

        return "User saved...";
    }

    @GetMapping("getUser")
    public List<User> getUser(){

        return userRepository.findAll();

    }
}