package com.example.SeptJavaSpring.di;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    int id;
    String name;
    String address;

    public void show(){

        System.out.println("In employee show");
    }
}

