package com.example.SeptJavaSpring;

import com.example.SeptJavaSpring.aop.BoysStudent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SeptJavaSpringApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context= SpringApplication.run(SeptJavaSpringApplication.class, args);
      //  Department department= context.getBean(Department.class);
       // department.showEmp();

//        ApplicationContext context1 = new AnnotationConfigApplicationContext(SimConfig.class);
//        Sim sim = context.getBean(Airtel.class);
//        sim.calling();
////		sim.data();




//        Department department = context.getBean(Department.class);
//        department.showEmp();
//



        //   Vodafone vodafone = new Vodafone();
//		vodafone.calling();
//		vodafone.data();
//
//		Airtel airtel = new Airtel();
//		airtel.calling();
//		airtel.data();

//		ApplicationContext context = new AnnotationConfigApplicationContext(SimConfig.class);
//		Sim sim = context.getBean(Jio.class);
//		sim.calling();
//		sim.data();

        //Human obj2 =context.getBean(Human.class);

        BoysStudent obj = context.getBean(BoysStudent.class);
        //jointpoint
        int i=obj.study(2);
        System.out.println(i);
        //        obj.MyException("My exception occurred...");
                //        jointpoint
    //        GirlsStudent obj3 = context.getBean(GirlsStudent.class);
    //        //jointpoint
    //        obj3.studyChemistry(5);
    //        //jointpoint


    }
    @GetMapping("hii")
    public String getMsg(){
        return "Hello spring ";
    }
}

