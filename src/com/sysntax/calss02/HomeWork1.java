package com.sysntax.calss02;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a java program to add,subtract,multiply and divide 2 decimal values. Your program should say. "The ________ of 2 number ____________ and___________is equal to ________________"
		
		//below coding for Arithmetic Operation
		
		
		double number1=20.59; ////we are using double in here because float is less storage and always we need to Put f at end of the float ex:20.59f
		double number2=10.59;
		double number3 =number1 + number2;
		
		System.out.println("1) output for Question#1 are:");
		
	
		System.out.println("          "  +  " The Addation of 2 numbers " + number1 + " and " + number2 + " is equal to " + number3);
		number3=number1 - number2; //reassign  the value for the existing variable
		System.out.println("          "+"  The subraction  of 2 numbers " + number1 + " and " + number2 + " is equal to " + number3);
		number3=number1*number2;
		System.out.println("          "+"  The Multiplication of 2 numbers " + number1 + " and " + number2 + " is equal to " + number3);
		number3=number1/number2;
		System.out.println("          "+"  The Divition  of 2 numbers " + number1 + " and " + number2 + " is equal to " + number3);
		
		
		System.out.println("***********************************************************************************************");
		
		//Question 2) Write a program to find the  square of the number 3.9. You program should  say "The Square of the _______is_________________".
		
		
 double Seq1=3.9;
Seq1*=3.9;// the other way of writing is Seq1=Seq1 *2;

System.out.println("2) output for Question#2 is:");
 
System.out.println("The square of the 3.9 is " + Seq1);
System.out.println("*************************************************************************************************************************");
 

	}

}
