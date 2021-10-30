package com.syntax.class07;
import java.util.Scanner;


public class WhileLoop01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int SecretNum=78;
		Scanner scan= new Scanner(System.in);
		int usernum =scan.nextInt();
		System.out.println("Please guess my screte number , it from 1 to 100");
		usernum= scan.nextInt();
		
		while(usernum!=SecretNum) {
			
			System.out.println("Please guess my screte number , it from 1 to 100");
			usernum= scan.nextInt();
		}
		
		System.out.println("You got it righr");

	}

}
