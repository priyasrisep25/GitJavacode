package com.syntax.class11;

public class Human {
	
	String name;
	int age;
	double height;
	double weight;
	char gender;
	String bloodType;
	
	void eat() {
		
		System.out.println(name+ "Eats a lot ");
		
	}
	
	
	void sleep() {
		
		System.out.println(name+  "is sleeping" );
	}

void walk() {
		
		System.out.println(name+ "with bloodtype" + bloodType + "is Walking");
	}

void sendMemes() {
	
	if(name.equals("Sebastian")) {
		
		System.out.println("Sending Memes");
	}
}
}
