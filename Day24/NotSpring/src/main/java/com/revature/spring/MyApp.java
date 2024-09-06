package com.revature.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        // Creating Spring Container
        ClassPathXmlApplicationContext container =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Fetching the BaseBallCoach bean
        BaseBallCoach bObj = container.getBean("bCoach", BaseBallCoach.class);
        System.out.println(bObj.getDailyWorkout());
        
        // Fetching the CricketCoach bean
        CricketCoach cObj = container.getBean("cCoach", CricketCoach.class);
        System.out.println(cObj.getDailyWorkout());
        
        // Closing the container
        container.close();
    }
}
