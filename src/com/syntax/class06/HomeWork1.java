package com.syntax.class06;
import java.util.Scanner;
public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* HW:  Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user.
		 * Please complete using switch case.
		 *  */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any two  numbers");
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		System.out.println("please enter what operation do you need perpare?(+,*,-,/)");
		//char  A = scan. next().charAt(0);
		String A= scan.next();
		  
	int total=0;
    switch(A) { //data type in here is char , so the case suppose same data type .
	 
	 case "+": 
		 total = value1 + value2;
		 A="multiplication";
		 break;
		 
	 case "-":
	 
		 total = value1 - value2;
		 A="Subraction";
	 break;
	 
	 case "*":
		 
		 total= value1 * value2;
		 A="Multiplication";
		 break;
		 
	 case "/":
		 if(value2!=0) {
			 total= value1 / value2;
		 }else {
			 System.out.println("cannnot by0");
		 }
		 total= value1 / value2;
		A="Division";
		 break;
	 
	 default:
		 
		total= 0;
		 
	 }if(total!=0) {
		 
		 System.out.println("The operator you selected is " + A  + " and the value  is "  + total);
		 
	 }else {
		 
		 
		 System.out.println("Invaild operator , try again!");
		 
	 }
	 
	 
	 }
		


	}


