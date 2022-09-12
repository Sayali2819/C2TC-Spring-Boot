package com.tns.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
//		Car car = new Car();
//		car.drive();
//		
//		Bike bike = new Bike();
//		bike.drive();
		
//		Vehicle obj = new Bike();
//		obj.drive();
		
		ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
		
		Vehicle obj = (Vehicle) con.getBean("vehicle");
		obj.drive();
		

	}

}
