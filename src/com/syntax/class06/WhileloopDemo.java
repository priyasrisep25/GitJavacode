package com.syntax.class06;

public class WhileloopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=2;
		while(i<=10) {
			
			System.out.println(i);
			i+=2; //i =i+2
		}
		
		System.out.println("I am outside the while loop");
		System.out.println(i);
		System.out.println("______________Another way____________");
		

		
		int a=1;
		while (a<=10) {
			
			if(a%2==0) {
				
				System.out.println(a); /* note, first time 1%2 is not equal to 0, 
				so the condition is falls  it will come out from the if condition , 
				but sine  it's in while loop  it will go back to the while loop */
			}
			 //increment by 1
			
		}
	}

}
