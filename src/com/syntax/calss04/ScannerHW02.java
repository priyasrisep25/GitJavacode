package com.syntax.calss04;
import java.util.Scanner;

public class ScannerHW02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.*/
		
		Scanner scan =new Scanner(System.in);
		System.out.println("How much your are looking ?"); // it will ask the user enter the value.
		
		double Loan= scan .nextDouble(); //the entered value will store  on the  value variable, 
										//the data type will be varied  on the   the input(like int, double, boolean etc)
		
		if(Loan<= 200000) {
			System.out.println(" Your are  eligable for this loan !");
		}else {
			
			System.out.println("Sorry , Your not  are ealigiable for this loan!");
		}

	}

}
