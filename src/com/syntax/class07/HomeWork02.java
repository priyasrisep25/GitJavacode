package com.syntax.class07;
import java.util.Scanner;
public class HomeWork02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Ask user what he/she wants to buy, ask for price and to pay for an item.
     continue asking to pay until user gets a right amount.
      conditions: 
                   if user gives extra money --> give change
		   if user gives less money --> ask how much more you need
The amount has to be accumulated if users add more money
Whenever a user is done with payments, tell them “Thank you for shopping!” */
		Scanner scan = new Scanner(System.in);
		System.out.println("What u want to buy");
		String item = scan.next();
		double cost = 2.50;
		double price =0.0;
	
	do {
		System.out.println("Please pay for item");
		 price = scan .nextDouble();
		if(price> cost) {
			double a = (price -cost);
			System.out.print("Please have ur  change $"  +a + "");
			System.out.println(" and Thank You for Shopping!");
		} else if(price<cost){
			double b =(price-cost);
			System.out.println("Please give change" + "$" + b);
		}
	}while(cost!= price);
	 
		
		
			
		
	}

}


