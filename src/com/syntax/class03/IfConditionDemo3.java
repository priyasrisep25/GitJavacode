package com.syntax.class03;

public class IfConditionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp=60;
		
		if(temp>=60) {
			
			System.out.println(" i am ging for beach");
			
		}
		else
		{
			System.out.println(" i am ging for walk");
			
		}
		 String userName= "priya"; 
		
		 if(userName.equals ("priya")) { //please  note we can't use == , > < are not allowed  in string  
			 //so for string only == and !=  but recommended not  to use  so always use line 22  use equal methond
			 System.out.println( "hi priya");
		 }
		 else
		 {
			 System.out.println( "i don't know"); 
		 }

	}

}
