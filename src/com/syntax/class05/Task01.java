package com.syntax.class05;
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**Prompt the user to enter person heights in inches. Person should be 
		 * classified as one of the following:
*s  hort (under 60 inch)
 m  edium(between 60 -72 inch)
    tall (over 72 inch) */
		
		Scanner scan= new  Scanner(System.in);
		
		System.out.println("Enter your heigh Inches");
		 int height = scan.nextInt();
		 
		 if(height<60) {
		
			 
			 System.out.println("Short");
		 
		 }else if(height<60 || height<=72){
		
		 System.out.println("Medlium");
		 
	} else if (height>72) {
		
		System.out.println("tall");
	}

}
}
