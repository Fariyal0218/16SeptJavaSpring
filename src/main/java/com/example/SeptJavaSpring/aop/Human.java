package com.example.SeptJavaSpring.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy()
public class Human {

//    advice
//    @Before("pointCut()")     //pointcut
//    public void wakeup(JoinPoint joinPoint){
//        System.out.println("Wake up"+joinPoint.getArgs()[0]);
//    }

//    @After("pointCut()")
//    public void sleep(){
//
//        System.out.println("Sleep");
//    }

//    @Pointcut("execution(public * study*(..))")
//    public void pointCut(){}
//

    @AfterReturning(pointcut="execution(public * study*(..))",returning = "value")
    public void afterRet(int value){

        System.out.println("After returning"+value);
    }

    @AfterThrowing(pointcut="execution(public void MyException(..))",throwing = "value")
    public void afterThrow(MyException value){

        System.out.println("After returning==>"+value);
    }
}
