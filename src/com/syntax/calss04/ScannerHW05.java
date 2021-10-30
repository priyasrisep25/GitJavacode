package com.syntax.calss04;
import java.util.Scanner;
public class ScannerHW05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Create a Java program that will ask if user has a credit card or not. 
		if you user does not have credit card then offer them. If they do have one ask what is balance on the  card 
		if balance of the card is large than 1000, tell them to pay off immediately, otherwise you can tell them that they can spend more*/

		Scanner BankDetails = new Scanner(System.in);
		System.out.println("Do you have credit card ? please enter true or false!");
		boolean Credit = BankDetails.nextBoolean();
		//String Credit= BankDetails.next(); ---- do get yes or no we can use this.
		
		if(Credit){ //note if condtion holds true then you don't need put ==true sign
		//if(credit.equals("yes"))
			//if(credit.eyalsIgnoreCase("yes")){}---> this will ignore the  case sensitive
			System.out.println("What is your balacne Amount?");
			int balance = BankDetails.nextInt(); //in here we capture the balance
			
			if(balance>1000) {
				
				System.out.println("Payment overdue ,pay of immediately!");
				
				
			}else {
				
				System.out.println("You can spend more!");
			}
			
		}else {
			
			System.out.println(" You can apply for card");
		}
		
		
		
		
	}

}
