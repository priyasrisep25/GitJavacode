package com.syntax.class05;

import java.util.Scanner;

public class LogicalOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		System.out.println("Do you have credit card ? please enter true or false!");
		String answer = input.next();
		
		if(answer.equals("yes") || answer.equals("yep") || answer.equals("Yeah")){
		
		System.out.println("Please tell me the ballance");
		
	}else {
		
		System.out.println("do you want to credit card? ");
	}
	
		System.out.println("end of the code? ");
}
	}
	
