package com.tutorials.session2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//Demo for bean in line

public class DrawingApp{
	
	public static void main(String[] args) {
		
		ApplicationContext appContext =
						new ClassPathXmlApplicationContext("beans.xml");
		Triangle triangleC =
				(Triangle) appContext.getBean("triangle-alias");//Step 9
		
		
		//Step 7 - Dependency injection of objects
		System.out.println("Drawing list of points using inheritence:");
		triangleC.draw();
	
	}

	
}
