package com.example.SeptJavaSpring.colorlib.repository;

import com.example.SeptJavaSpring.colorlib.domain.MealPreference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealPrefRepo extends JpaRepository<MealPreference,Integer> {
}
