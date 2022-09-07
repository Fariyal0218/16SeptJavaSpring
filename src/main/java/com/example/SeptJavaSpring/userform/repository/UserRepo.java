package com.example.SeptJavaSpring.userform.repository;

import com.example.SeptJavaSpring.userform.domain.UserForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserForm,Integer> {

}
