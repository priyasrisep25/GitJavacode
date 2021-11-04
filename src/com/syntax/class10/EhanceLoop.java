package com.syntax.class10;
import java.util.Scanner;

public class EhanceLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// note: enhance loop goes string , it do any reverse order. and also 
		// i want to create an array and store elements in scanner.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please enter how many elements you want to store inside array of cars");
		 int size= scan.nextInt();
		 String[] cars = new String[size];
		 
		 //storing elements inside an array of cars
		 for(int i=0; i <cars.length; i++) {
			 
			 System.out.println("Please enter your car name");
			 cars[i]=scan.next();
			 
		 }
		 
		 //retrieve all stored elements
		 for(String car : cars) {
			 
			 System.out.println(car + " ");
		 }
		
	}

}
