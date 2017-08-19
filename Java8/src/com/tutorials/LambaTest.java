package com.tutorials;

public class LambaTest {
	
	public static void main(String[] args) {
	
		// Use Runnable inner class
		Runnable greet1 = new Runnable() {
			public void run(){
				System.out.println("Hello from Anonymous class!");
			}
		};
		
		//Lambda for runnable interface  
		Runnable greet2 = () -> System.out.print("Hello from lambda function");
		
		greet1.run();
		greet2.run();
		
		
	
	}

}
