package com.syntax.class07;

import java.util.Scanner;

public class GuessNumberWithWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* let create a secrete number 1 to 100
		 * lets ask user to guess my secrte number
		 * keep asking for a number till user goes the secret #
		 */
		int SecretNum=78;
		Scanner scan= new Scanner(System.in);
		int usernum;
		
		System.out.println("Please guess my screte number , it from 1 to 100");
		usernum= scan.nextInt();
		while(usernum!=SecretNum) {
			
			System.out.println("Please guess my screte number , it from 1 to 100");
			usernum= scan.nextInt(); //Question why we are not assign  variable name inside the do
		
		}
		System.out.println("You got it !!!");

	}

}
