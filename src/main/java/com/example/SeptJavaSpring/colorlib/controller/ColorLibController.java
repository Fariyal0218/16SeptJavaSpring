package com.example.SeptJavaSpring.colorlib.controller;

import com.example.SeptJavaSpring.colorlib.domain.ColorLib;
import com.example.SeptJavaSpring.colorlib.domain.MealPreference;
import com.example.SeptJavaSpring.colorlib.repository.ColorLibRepo;
import com.example.SeptJavaSpring.colorlib.repository.MealPrefRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorLibController {

    @Autowired
    private ColorLibRepo colorLibRepo;

    @Autowired
    private MealPrefRepo mealPrefRepo;

    @PostMapping("saveMeal")
    public String saveMealPref(@RequestBody MealPreference mealPreference){
        mealPrefRepo.save(mealPreference);
        return "meal pref saved..";

    }

    @PostMapping("saveColorLib")
    public String saveColorLib(@RequestBody ColorLib colorLib){
        colorLibRepo.save(colorLib);
        return "color lib saved..";
    }

}
