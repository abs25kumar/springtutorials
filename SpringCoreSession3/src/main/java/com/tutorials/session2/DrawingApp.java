package com.tutorials.session2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp{
	
	public static void main(String[] args) {
		
		AbstractApplicationContext appContext =
				new ClassPathXmlApplicationContext("beans.xml");
		appContext.registerShutdownHook();
		
		//Step 15 - Refactor and program to interface
	   Shape  shapeA =
				(Shape) appContext.getBean("triangle");
	   Shape  shapeB =
				(Shape) appContext.getBean("circle");
		
	   
	   System.out.println("Drawing Shape A");
	   shapeA.draw();
	   
	   System.out.println("Drawing Shape B");
	   shapeB.draw();
	
	
	}

	
}
