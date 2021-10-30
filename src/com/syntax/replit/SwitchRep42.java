package com.syntax.replit;
import java.util.Scanner;

public class SwitchRep42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program using the switch statement

		Let us consider there are three students in the class with roll number starting from (101 to 103) 
		if any number other than 101-103 are present display "Not found Student name: in Class" */
		
		 Scanner scan = new Scanner (System.in);
		  System.out.println("Enter the roll number of the Child");
		  int roll = scan .nextInt();
		String name=null;

		switch(roll){
		  case 101:
		  name="Ramesh";
		  break;
		  
		  case 102:
		  name="Mahesh";
		  break;
		  
		  case 103:
		  name ="Mukesh";
		  break;
		   
		 default:
		 name= "Invaild";
		}
		if(!name.equalsIgnoreCase("Invaild")){

		  System.out.println("Student name: " + name);
		}else{
		  System.out.println("Not found Student name: in Class");
		}
	}

}
