package com.tutorials.session2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp{
	
	public static void main(String[] args) {
		
		ApplicationContext appContext =
				new ClassPathXmlApplicationContext("beans.xml");
				
		Triangle triangleC =
				(Triangle) appContext.getBean("triangle-alias");//Step 9
		
		//Step 6 - Constructor injection of primitives
		System.out.println("Demo of constructor arguments");
		System.out.println(triangleC.getType());
		System.out.println(triangleC.getHieght());
		
		//Step 7 - Dependency injection of objects
		System.out.println("Draw Triangle with points");
		triangleC.draw();
	
	}

	
}
