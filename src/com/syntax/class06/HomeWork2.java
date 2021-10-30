package com.syntax.class06;
import java.util.Scanner;
public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* HW:  Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user.
		 * completed using else if.
		 *  */
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter two number");

		int num1 = scan.nextInt();
		int num2= scan.nextInt();
		System.out.println("please enter what operation do you need perpare?(+,*,-,/)");
		char value = scan .next().charAt(0);
		int add=num1 +num2;
		int sub=num1 -num2;
		int mul=num1 * num2;
		int  div= num1 / num2;
		int total =0;
		
		if(value =='+') {
			
			total = add; 
			
		}else if(value == '-') {
			
			total = sub;
			
		}else if(value == '*') {
			
			 total=mul;
		}else if(value == '/') {
			
			total = div;
		}else if(!=value){

			System.out.println("Invalid , please try again");
			
		}
		
		System.out.println("The operator you selected is " + value  + " and the value  is "  + total);
		}
			
			
			
		
		}
		
		
	

		 
		


