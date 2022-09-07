package com.example.SeptJavaSpring.registration.repository;

import com.example.SeptJavaSpring.registration.domain.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<Registration,Integer> {
        
    Registration findByNameAndPassword(String name,String password);

}
