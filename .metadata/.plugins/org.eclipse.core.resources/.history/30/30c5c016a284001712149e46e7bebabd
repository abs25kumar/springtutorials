package com.tutorials.session2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp{
	
	public static void main(String[] args) {
		
		
		//Step 13- Abstract Application Context added to set up shut down hook
		// This tells the application context when main method is done
		//We will remove the application context reference
		
		//ApplicationContext appContext =
				//		new ClassPathXmlApplicationContext("beans.xml");
				
		AbstractApplicationContext appContext =
				new ClassPathXmlApplicationContext("beans.xml");
		appContext.registerShutdownHook();
		
		
		Triangle triangleC =
				(Triangle) appContext.getBean("triangle-alias");//Step 9
		
		//Step 6 - Constructor injection of primitives
		System.out.println("Demo of constructor arguments");
		System.out.println(triangleC.getType());
		System.out.println(triangleC.getHieght());
		
		//Step 7 - Dependency injection of objects
		System.out.println(triangleC.getPointA());
		System.out.println(triangleC.getPointB());
		System.out.println(triangleC.getPointC());
		
		//Step 10 - Dependency injection of list
		System.out.println("Demo 10 - Drawing list of points from collection:");
		triangleC.draw();
	
	}

	
}
