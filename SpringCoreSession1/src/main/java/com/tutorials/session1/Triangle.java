package com.tutorials.session1;

public class Triangle {
	
	//Step 4- Add a property and configure it using setter injection
	public String type = null;
	
	//Ste 6 - Add Hieght to demonstrate multiple athument constructors
	public int hieght =0;
	
   
	public int getHieght() {
		return hieght;
	}

	public void setHieght(int hieght) {
		this.hieght = hieght;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void draw() {
		System.out.println("Draw a triangle");
	}

	//Step 5 - Add constructor for constructor injection
	public Triangle(String type) {
		super();
		this.type = type;
	}
	
	//Step 6 - Test multiple constructor cases with one argument
	public Triangle(int hieght) {
		super();
		this.hieght = hieght;
	}
	
	//Step 6 - Test multiple constructor cases with multiple arguments
	public Triangle(String type, int hieght) {
		super();
		this.type = type;
		this.hieght = hieght;
	}
	

	public Triangle() {
		super();
	}

}
