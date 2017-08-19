package com.tutorials.demo;

public class carTest {
	
	public static void main(String[] args) {
		
		//Class Demo - Construct my Car objects
		CarInterface myCar = new Car("yellow", 1, 1000000,0,0);
		System.out.println(myCar);
		
		//Methods Demo - Change the state of my car object using its methods
		myCar.changeGear(2);
		myCar.speedUp();
		System.out.println("After gear change and speed up");
		System.out.println(myCar);
		
		//Inheritence Demo - Construct and print inherited objects
		SedanCar mySedanCar = 
				new SedanCar("yellow",1,1100000d,0f,0,125f);
		System.out.println(mySedanCar);
		
		//Interface Demo - Know the interface and drive any car
		CarInterface hondacitycar = 
				new SedanCar("yellow",100l,1100000d,0f,0,125f);
		hondacitycar.speedUp();
		System.out.println(hondacitycar);
		
		
	}

}
