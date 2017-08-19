package com.tutorials.session2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp{
	
	public static void main(String[] args) {
		
		ApplicationContext appContext =
				new ClassPathXmlApplicationContext("beans.xml");
				
		Triangle triangleC =
				(Triangle) appContext.getBean("triangle-alias");//Step 9
		
		//Step 10 - Dependency injection of list
		System.out.println("Demo 10 - Drawing list of points from collection:");
		triangleC.draw();
	
	}

	
}
