package com.syntax.reviewclass4;
import java.util.Scanner; 

public class BooleanNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**Create a program that prompt user with question: "Do you need a loan?"

If the result is true then prompt user with question: "What is your credit score?". Otherwise eligibility is "Unknown"

Based on the score define users eligibility:

if score is below 600 --> eligibility = "Not eligible"
if score is between 600 and 700 inclusive --> eligibility = "Maybe eligible"
if score is between 701 and 800 inclusive --> eligibility = "Eligible"
if score is higher than any other previous values --> eligibility = "Definitely eligible" .*/
		
		
		Scanner scan = new Scanner(System.in);
		System .out.println("DO you need a loan?");
		boolean  creditDetails = scan .nextBoolean();

		if(creditDetails){
		System.out.println("What is your credit score?");
		int score= scan .nextInt();
		if(score<600){
		 System.out.println(" The eligibility is Not eligible" );
		}else if(score>=600 && score<=700){
		 System.out.println(" The eligibility is Maybe eligible" );
		}else if(score>=701 && score<=800){
		   System.out.println(" The eligibility is Eligible" );
		}else{ 
		  System.out.println(" The eligibility is Definitely eligible" );
		}
		}else{
		  System.out.println("Unknown");
		}

	}

}
