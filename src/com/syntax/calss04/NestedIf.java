package com.syntax.calss04;

public class NestedIf {

	public static void main(String[] args) {

		String day = "Friday";
		int data = 13;

		if (day.equals("Friday")) {

			System.out.println("I am going to the movies today");
			if (data == 13) {
				System.out.println(" Iam watching a scary movie");
			} else {
				System.out.println("i am watching comedy movie");

			}

		} else {
			System.out.println("i am watching comedy movie");

		}

	}

}
