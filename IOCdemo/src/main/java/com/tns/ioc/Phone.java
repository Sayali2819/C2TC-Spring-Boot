package com.tns.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Phone {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		Sim s = con.getBean("sim", Sim.class);
		s.calling();
		s.data();

	}

}
