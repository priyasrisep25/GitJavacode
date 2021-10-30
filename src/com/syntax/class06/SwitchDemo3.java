package com.syntax.class06;
import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  we need to capture a country from user
		 * based on the country we have to define a favorite food
		 */
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter the country");
		String coun =scan.next();
		String food = null;
		
		
		
		switch(coun.toLowerCase()) {
			
		case "india":
			food= "rice"; //in here we are  assign the value from user
			food="chappti"; //then in here we reassigning the value to the food variable
			break;
			
		case "italy":
			food="Pizza";
			break;
		case "usa":
			food =" apple pie";
			break;
			
			default:
			 food="unknown";
			
		}
		if (!food.equals("unknown")) {
			
		System.out.println("if your country is " +coun + " famous food are " +food );
		
		
		}else {
			
			System.out.println("pelase try another country");
		}
}
		
		

		
	}


