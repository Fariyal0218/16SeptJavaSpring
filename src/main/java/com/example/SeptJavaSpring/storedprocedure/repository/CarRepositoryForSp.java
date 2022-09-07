package com.example.SeptJavaSpring.storedprocedure.repository;

import com.example.SeptJavaSpring.onetomany.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface CarRepositoryForSp extends JpaRepository<Car,Integer> {

    @Query(value = "{call getCarData1()}",nativeQuery = true)
    List<Map<String,String>> getCarDetails();
}
