package com.tutorials.demo;


public class Car implements CarInterface {
	
	private String color = null;
	private long model = 0l;
	private double price = 0d;
	private float currentSpeed = 0f;
	private int currentGear = 0;
	
	
	public Car() {
		super();
		
	}

	public Car(String color, long model, double price, float currentSpeed, int currentGear) {
		super();
		this.color = color;
		this.model = model;
		this.price = price;
		this.currentSpeed = currentSpeed;
		this.currentGear = currentGear;
	}

	public float getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(float currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public long getModel() {
		return model;
	}

	public void setModel(long model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	/* (non-Javadoc)
	 * @see com.tutorials.demo.CarInterface#speedUp(float)
	 */
	@Override
	public void speedUp() {
		this.currentSpeed += 1;
	}
	
	/* (non-Javadoc)
	 * @see com.tutorials.demo.CarInterface#changeGear(int)
	 */
	@Override
	public void changeGear(int gear) {
		this.currentGear = gear;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", model=" + model + ", price=" + price + ", currentSpeed=" + currentSpeed
				+ ", currentGear=" + currentGear + "]";
	}

	
}
