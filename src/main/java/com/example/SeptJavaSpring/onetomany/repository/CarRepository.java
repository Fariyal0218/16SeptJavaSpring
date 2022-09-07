package com.example.SeptJavaSpring.onetomany.repository;

import com.example.SeptJavaSpring.onetomany.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Integer> {
}
