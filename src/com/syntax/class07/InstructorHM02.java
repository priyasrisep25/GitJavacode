package com.syntax.class07;

public class InstructorHM02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0 ; i<=10; i++) {
			
			System.out.println("Almost");
			if(i==3) {
				System.out.println("About to break it");
				break; //Usually we add the break inside the condtion
				//continue will use inside the condition.
			}
			
			
		}
		
		System.out.println("*********************")
		;
		
		boolean  summer=true;
		int temp=75;
		
		while(summer) {
			
			System.out.println("I am happy, love summer");
		
		if(temp>=100) {
			
			System.out.println("i don't like summer");
			break;
		}
		temp+=5;
		}

	}

}
