package com.example.SeptJavaSpring.aop;

import org.springframework.stereotype.Component;

@Component
public class BoysStudent {

    public int study(int i){
        System.out.println("Boys Study"+i);
        return 300;
    }

    public void MyException(String str) {
        throw new MyException(str);
    }
}
