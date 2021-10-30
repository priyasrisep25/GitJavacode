package com.syntax.class03;

public class Task1HwReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//alwayys try sudo code first before starting code.
		
		/*
		 * 
		 */
		double number1=10.50;
		double number2=10.50;
		double sum=number1+ number2; //we are using double in here because float is less storage and always we need to Put fat end o 
		double sub=number1-number2;
		double mul=number1 * number2;
		double div=number1/number2;
		//System.out.println("The Addition of 2 number" + number1+ " and" +number2 +" is equal to" + sum ); //both are correct line 18 & 19
		System.out.println("The Addition of 2 number" + number1+ " and" +number2 +" is equal to" + (number1 +number2));
		System.out.println("The Addition of 2 number" + number1+ " and" +number2 +" is equal to" + sub);
		System.out.println("The Addition of 2 number" + number1+ " and" +number2 +" is equal to" + mul );
		System.out.println("The Addition of 2 number" + number1+ " and" +number2 +" is equal to" + div);
	}

}
