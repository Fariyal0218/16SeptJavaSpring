package com.example.SeptJavaSpring.onetoone.repository;

import com.example.SeptJavaSpring.onetoone.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
