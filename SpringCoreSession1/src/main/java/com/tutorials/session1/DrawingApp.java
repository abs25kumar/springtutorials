package com.tutorials.session1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class DrawingApp {
	
	public static void main(String[] args) {
		
		//Step 1 - With out Spring
		System.out.println("Demo With out Spring");
		Triangle triangle = new Triangle();
		triangle.draw();
		
		//Step2 - With Spring Bean Factory
		System.out.println("Demo With Bean Factory");
		@SuppressWarnings("deprecation")
		BeanFactory bf = new XmlBeanFactory (
				new ClassPathResource("beans.xml"));;
		Triangle triangleB =
				(Triangle)bf.getBean("triangle");
		triangleB.draw();
		
		//Step 3 - Use Application Context
		System.out.println("Demo using application context");
		ApplicationContext appContext =
				new ClassPathXmlApplicationContext("beans.xml");
		Triangle triangleC =
				(Triangle) appContext.getBean("triangle");
		triangleC.draw();
		
		//Step 4 - Add a new property and configure using spring setter injection
		//System.out.println("Demo of configuring properties for setter injection");
		//System.out.println(triangleC.getType());
		
		//Step 5 - Add properties using constructor injection
		System.out.println("Demo of constructor arguments");
		System.out.println(triangleC.getType());
		
		//Step6 - Multiple constructor injection
		System.out.println("Demo of multiple constructor arguments");
		System.out.println(triangleC.getType());
		System.out.println(triangleC.getHieght());
	}
	
	

}
