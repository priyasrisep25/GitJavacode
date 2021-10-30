package com.syntax.class06;
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Allow user to enter grade (A, B, or C etc...) and then provide explanation: 
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a 
		 * user with explanation.
		 */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter grade");
		char  grade= scan. next().charAt(0);		
		String value =null;
		
		switch(grade) {
		
		case 'A':
			value= "Excellent";
			break;
		case 'B':
			value= "Good";
			break;
			
		case 'C':
			value= "Averag";
			break;
		case 'D':
			value= "Bad";
			break;
			
			default:
			value="Incorrect";
			
		}if(!value.equals("Incorrect")) {
			
			System.out.println("your Grade is " + value);
			
		}else {
			
			System.out.println("pelase try again");
		}
	
		

	}

}
