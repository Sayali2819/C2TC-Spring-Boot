package com.tns.ioc;

public class Client {

	public static void main(String[] args) {
		
		//Airtel
		Airtel obj = new Airtel();
		obj.calling();
		obj.data();
		
		//Jio
		Jio obj1 = new Jio();
		obj1.calling();
		obj1.data();

	}

}
