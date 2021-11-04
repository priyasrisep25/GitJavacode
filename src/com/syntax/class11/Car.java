package com.syntax.class11;

public class Car { //first define the attributes , and making object 
	
	String make;
	String model;
	String color;
	int year;
	double milage;
	void moveForward() { //basically in here we are define the method/behavior of the class.
		
		System.out.println("Car can move forward ");
		
	}
	void applyBreaks() {
		
		System.out.println("Applying breaks ");
	}
	
	public static void main(String[] args) {
		
		Car ayshasCar = new Car();
		ayshasCar .make= "Tesla";
		ayshasCar.model="S";
		ayshasCar.color= "Black";
		
		System.out.println("Ayshas car is " + ayshasCar.make);
		System.out.println("Ayshas car is " + ayshasCar.model + " Model");
		System.out.println("Ayshas car is " + ayshasCar.color);
		ayshasCar.moveForward(); //i am calling moveForward method
		ayshasCar .applyBreaks();
		
		
		
		
		
	}
		
	}


