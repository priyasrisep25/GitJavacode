package com.syntax.class05;
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ask user to enter 3 numbers and define which is the largest number.
	
		Scanner Scan= new Scanner(System.in);
		
		System.out.println("Please Enter Three#");
		int  num1 = Scan.nextInt();
		int  num2= Scan.nextInt();
		int  num3= Scan.nextInt();
		
		int Largest =0;// note if we don't put else in the if condition , 
		//better put variable =0
		
    if (num1==num2 && num1==num3 ){
			
		System.out.println("number are equals");
     } else {
    	 
    	if (num1>num2 && num1>num3) {
			
			Largest=num1;
		}else if(num2>num1  && num2>num3) {
			
			Largest=num2;
		}else if(num3>num1 && num3>num2) {
			
			Largest=num3;
			
			//boolean IsEven; //given variable IsEven
			//if(Largest%2==0) {
				//IsEven=true;
			//}else {
				//IsEven=false;
			//}
			
			
			System.out.println(Largest + " is the largest");
		}
		}
		
		
		
		
				
				
	}

}
