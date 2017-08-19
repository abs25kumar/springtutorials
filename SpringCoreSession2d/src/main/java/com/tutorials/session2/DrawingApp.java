package com.tutorials.session2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp{
	
	public static void main(String[] args) {
		
		
		ApplicationContext appContext =
						new ClassPathXmlApplicationContext("beans.xml");
		Triangle triangleC =
				(Triangle) appContext.getBean("triangle-alias");//Step 9
		
		triangleC.draw();
	
	}

	
}
