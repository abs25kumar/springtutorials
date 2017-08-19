package com.tutorials.session2;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class Triangle {
	
	private String type = null;
	private int hieght =0;
	
	private Point pointA= null;
	private Point pointB = null;
	private Point pointC = null;
	
	
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
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointc) {
		this.pointC = pointc;
	}
	
	public void draw() {
		System.out.println(pointA);
		System.out.println(pointB);
		System.out.println(pointC);
	}
	
}
