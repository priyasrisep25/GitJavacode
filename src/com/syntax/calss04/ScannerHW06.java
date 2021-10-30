package com.syntax.calss04;
import java.util.Scanner;
public class ScannerHW06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/* Write a program to ask user to enter numbers of worked years and annual salary. If user worked for more or equals to 5 years than user is eligible for the bonus, 
		 * *otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */
		Scanner Employee = new Scanner(System.in);
		System.out.println("How many years are you been working & what is your annaul Salary?");
		int Year= Employee. nextInt();
		int Salary= Employee.nextInt();
		
		
		 
	 if(Year>=5) {
		 
	 if(Salary>=5000) {
			 
			 System.out.println("Your will Receive bonus $5000");
		 }else {
			 
			 System.out.println("Your will Receive bonus $3000");
		 
		 
		 }
	
	 }else {
		 
		 System.out.println(" Sorry, Your are not Eligiable for the Bonus!");
	 }
	 }
		
	}


