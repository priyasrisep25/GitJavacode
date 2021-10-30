package com.syntax.calss04;
import java.util.Scanner; //we always want to put this line when we make a scanner class.

public class ScannerHW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Java program to capture 2 numbers from a user and define which number is the largest.
		
		Scanner user= new Scanner(System.in); // it allows user to enter the value through keyboard
		System.out.println("Enter a number");// it will ask the user to enter the value
		int value1= user.nextInt();
		System.out.println("Enter another  number");/** we are using this syntax , to store the input  what we received from user  
		 												*basically this Methods used to read specific types of data from the keyboard what user entered
		 												*System.out.println(value); //after enter the value on the console this out purt will show. */
		int value2= user.nextInt();
		
		if (value1> value2) {
			
			System.out.println(value1 + " is largest");
		}else {
			
			System.out.println(value2 + " is largest");
		}
			
		
			
		}
	}


