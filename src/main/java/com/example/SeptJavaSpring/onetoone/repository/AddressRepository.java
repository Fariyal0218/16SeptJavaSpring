package com.example.SeptJavaSpring.onetoone.repository;

import com.example.SeptJavaSpring.onetoone.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
