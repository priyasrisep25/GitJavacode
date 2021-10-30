package com.syntax.class06;
import java.util.Scanner;
public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Ask user to enter their country and capture it. Once values are captured print which 
		 * language user speaks.
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("pelase enter the country");
		String Coun = scan.next();
		String Language=null;
		
		switch(Coun.toUpperCase()) {
		
		case "INDIA":
			
			Language="Hindi";
			break;
		
         case "USA":
			
			Language="English";
			break;
         case "MEXICO":
 			
 			Language="Spanich";
 			break;
 			
 			default:
 				Language="Invalid";
 			break;
 		
		}if(!Language.equals("Invalid")) {
			
			System.out.println("In " + Coun + " they Speak " + Language);
		}else {
			
			System.out.println("pelase try another country");
		}
		
		
		

	}

}
