package com.tutorials.demo;

public class SedanCar extends Car {
	
	private float lengthOfTrunk = 0;

	public SedanCar(String color, long model, double price, float currentSpeed, int currentGear, float length) {
		super(color, model, price, currentSpeed, currentGear);
		this.lengthOfTrunk = length;
	}

	public float getLengthOfTrunk() {
		return lengthOfTrunk;
	}

	public void setLengthOfTrunk(float length) {
		this.lengthOfTrunk = length;
	}
	
	@Override
	public void speedUp() {
		this.setCurrentSpeed(this.getCurrentSpeed()+2);
		
	}

	@Override
	public String toString() {
		return "SedanCar [length of Trunk=" + lengthOfTrunk + ", getLength()=" + getLengthOfTrunk() + ", getCurrentSpeed()="
				+ getCurrentSpeed() + ", getCurrentGear()=" + getCurrentGear() + ", getColor()=" + getColor()
				+ ", getModel()=" + getModel() + ", getPrice()=" + getPrice() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}	
	
}
