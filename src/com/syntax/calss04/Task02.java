package com.syntax.calss04;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double rate=5;
		double price=100000;
		
		if(rate>4.5) {
			 
			System.out.println("You can Buy a house!");
			
			if(price>200000) {
				System.out.println("You can take a loan");
			}else {
				System.out.println("You can pay cash");
			}
				
			
		}else {
			System.out.println("You can not Buy a house!");
			
		}
		

	}

}
