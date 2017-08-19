package com.tutorials.session2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

//Step 19- Add component annotation for circle

@Component
public class Circle 
	implements Shape {
	 
	Point center;

	public Point getCenter() {
		return center;
	}
    //Step 18- Add autowired annotation
	@Required
	@Autowired
	@Qualifier("zeropoint")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Circle:");
		System.out.println("Center:"+center);
		
	}

}
