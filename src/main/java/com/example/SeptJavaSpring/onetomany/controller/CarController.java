package com.example.SeptJavaSpring.onetomany.controller;

import com.example.SeptJavaSpring.onetomany.domain.Car;
import com.example.SeptJavaSpring.onetomany.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @PostMapping("saveCar")
    public String saveCar(@RequestBody Car car){
        carRepository.save(car);
        return "Car Saved";

    }

    @GetMapping("getCar")
    private List<Car>getCar(){
        return carRepository.findAll();
    }
}
