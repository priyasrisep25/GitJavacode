package com.syntax.calss04;

public class NestedIfMoreExmples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//note in if else condition  , only one condition will 
		//execute based on the statement .
		//else if goes like a ladder

		boolean replCompleted = true;
		int assignments =10;

		if (replCompleted) {

			System.out.println("Great Job");

			if (assignments > 16) {

				System.out.println("Your doing amazing job!");
			} else if (assignments > 10) {

				System.out.println("You did good but you should do more");
			} else if (assignments > 6) {
				System.out.println("You need to try do more HW");

			}

		} else {

			System.out.println("Please; make sure you do your homework");
		}

	}

}
