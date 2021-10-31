package com.sysntax.class08;
import java.util.Scanner;
public class HomeWork01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Create a program that will keep asking user to apply for a credit card. 
		 * As soon you get “yes” from a user program should stop asking.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		String credit =null;
		
		
		do {
			
			System.out.println(" Do you like to apply  for Credit Card? Please enter 'yes' or 'no'");
			credit = scan.next();
			
		}while(!credit.equalsIgnoreCase("yes"));
			
		System.out.println("Thank You for the bussiness!");
		
		

	}

}
