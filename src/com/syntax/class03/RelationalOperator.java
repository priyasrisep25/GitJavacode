package com.syntax.class03;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 10;
		int number2 = 20;

		System.out.println(number1 == number2); // check if both variable contain same thing or not == equal means
												// equality and = is for assigning ex:int a=10;
		//boolean result = number1 == number2; // please note this will execute but == is already their so we can use line
												// 12 code.
		//System.out.println(result);
		//System.out.println(number1 = number2); // basically in here we are assing number2 value to number1

		System.out.println("*************************");

		System.out.println(number1 > number2);
		System.out.println(number1 < number2);
		System.out.println("*************************");
		int number3 = 10;
		int number4 = 10;
		System.out.println(number1 > number2); //
		System.out.println(number1 < number2);
		System.out.println("*************************");
		System.out.println(number3>=number4);
		System.out.println(number3<=number4);
		System.out.println("*************************");
		System.out.println(number3!=number4); // meaning #3 not equal to #4 , we will get the result false because #3  & #4 have same value(10) so they are equal.
		
		
		
		
		
		
		

	}

}
