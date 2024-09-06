package com.revature.vehicles;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("Config.xml");
        Vehicle vehicle=context.getBean("myVehicle",Vehicle.class);
        System.out.println(vehicle.getMileage());
        
        System.out.println(vehicle.getDiscountMessage());
        
        System.out.println(vehicle.getBrandName());
        
        System.out.println(vehicle.getMrp());
        
        
	}

}
