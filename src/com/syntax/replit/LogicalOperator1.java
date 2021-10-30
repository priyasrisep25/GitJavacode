package com.syntax.replit;
import java.util.Scanner;

public class LogicalOperator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"

and make the comparisons:

if int1 and int2 are equal and word1 and word2 are equal, output "AND"
if int1 and int2 are equal or word1 and word2 are equal, output "OR"
if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"
**Example input/output: */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two strings and pelase enter two numbers");
		String word1= scan.next();
		String word2= scan.next();
		int num1 = scan .nextInt();
		int num2= scan.nextInt();
		 if(num1==num2 && word1.equalsIgnoreCase(word2)){
		  System.out.println("AND");
		 }else if (num1==num2 || word1.equalsIgnoreCase(word2)){
		   System.out.println("OR");
		 }else if(num1!=num2 && !word1.equalsIgnoreCase(word2)){
		   System.out.println("NONE");
		 }

	}

}
