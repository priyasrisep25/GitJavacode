package com.syntax.class05;
import java.util.Scanner;

public class HW02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
		if the average score >=90 → grade=A
		if the average score >= 70 and <90 → grade=B
		if the average score>=50 and <70 → grade=C
		if the average score<50 → grade=F */
		
	Scanner scan= new Scanner(System.in);
	System.out.println("plesae enter your Quiz, mid term and final score");
	int Quiz = scan.nextInt();
	int Mid =scan.nextInt();
	int Final=scan.nextInt();
	int AverageScore =((Quiz+Mid+Final)/3);
	
	String Grade=null;
	if(AverageScore>=90) {
	Grade="A"; 
	}else if(AverageScore>=70 && AverageScore<90) {
	Grade="B";  
	}else if(AverageScore>=50 && AverageScore<70) {
	Grade="C"; 
	}else if(AverageScore<50) {
	Grade="F"; //System.out.println("Sorry Your Grade is F , but try hard never give up!");
	}
	System.out.println("Your Grade is " + Grade + "!");
		
	
		
		

	}

}
