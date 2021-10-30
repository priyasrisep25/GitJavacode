package com.syntax.class05;
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System .out.println("Please enter the Time");
		int time= scan.nextInt();
		String TimeOfday =null; // short way to type the code by using this , 
		//and also we have give value to the variable depend on the day type , check below
		//Compiler can give  only default values to the variables:
		
		//int---> 0 ex: int value=0
		//double--->0.0
		//String--->null
		//boolean----->false
		
		if(time>=1 &&  time<=11) {
			
			TimeOfday="Morning";
			
			//System.out.println("Mornning"); this one also work , but to make short
			//we given variable line 12 and called here  and we will make only one time will we can type output
		}else if(time>=12 && time<=15) {
			
			//System.out.println("Aternoon");
			TimeOfday="Afternoon";
		}else if(time>=16 &&  time<=20) {
			TimeOfday="Evening";
			//System.out.println("Evening");
		}else if(time>=21 && time<=24) {
			
			TimeOfday="night";
			
			//System.out.println("Night");
		}else {
			
			TimeOfday="Invalid#";
		}
		 
		
			System.out.println("Right now the time is "+TimeOfday);
			
			
			}
	
	
		
		

	}


