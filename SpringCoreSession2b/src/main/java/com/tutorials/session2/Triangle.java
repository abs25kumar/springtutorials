package com.tutorials.session2;

import java.util.List;


public class Triangle 
{
	private String type = null;
	private int hieght =0;
	
	//Step 10 - Set list of points
	private List<Point> points;
	
	public List<Point> getPoints() {
		return points;
	}
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	public Triangle() {
		super();
	}
	public Triangle(String type) {
		super();
		this.type = type;
	}
	
	public Triangle(int hieght) {
		super();
		this.hieght = hieght;
	}
	
	public Triangle(String type, int hieght) {
		super();
		this.type = type;
		this.hieght = hieght;
	}
	   
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
		for(Point point : points)
			System.out.println(point);
	}
	
}
