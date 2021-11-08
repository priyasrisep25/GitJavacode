package com.syntax.class013;
import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Write a program that reads two people's first
		names and if they expecting boy or girl? 
	Based on the input suggests a name for a baby:
	Example Output:
	Mom’s first name? Mary
	Dad’s first name? Daniel
	Boy or Girl? boy
	Suggested baby name: DANRY
	Example Output:
	Mom’s first name? Mary
	Dad’s first name? Daniel
	Boy or Girl? girl
	Suggested baby name: MAIEL */
		
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Please enter Dad's first name?");
		String dadName = Scan .next();
		System.out.println("Please enter Mom's first name?");
		String momName = Scan .next();
		System.out.println("Please enter is boy or girl?");
		String baby  = Scan.next();
		
		
		
		
	//	if(momName.equalsIgnoreCase("Mary") && dadName.equalsIgnoreCase("Daniel")) { //i believe we no need this 
			
		if(baby.equals("boy")) {
				
				
System.out.println("Baby name: "+ dadName.toUpperCase().charAt(0) + dadName.toUpperCase().charAt(1) +dadName.toUpperCase().charAt(2) + momName.toUpperCase().substring(2));
			
	}else {
				
		System.out.println( "Baby name: " + momName.toUpperCase().charAt(0)+momName.toUpperCase().charAt(1)+ dadName.toUpperCase().substring(3));
				
				
			
			
			
			
		}
		
		

	}
}


