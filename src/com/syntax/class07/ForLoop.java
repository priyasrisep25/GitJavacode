package com.syntax.class07;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* we use fpr loop when we know in advance 
		how many times we have to repeat block of code.*/
		
		for(int i=1 ; i<=5 ; i++) { // it will check initialization first which is i=1 . step 2  it goes to condiotn 
			//, next step 3 statement got execute  and then goes to increment , 
			//this step will repeat again again until the condition is true.
			
			System.out.print("Hello");
			
			
		}
		System.out.println();
		System.out.println("******************************************************************");
		
		System.out.print("------ print number from 1 to 20 ---");
		
		for(int i=1; i<=20 ; i++) {
			
			System.out.print(i+ " ");
			
			
		}
			System.out.println();
			
			System.out.println("******************************************************************");
			
			/* 
			 * 1. start point 
			 * 2. end point
			 * incre/ decrement
			 * 
			 */
			
			System.out.println("------ print even 2number from 1 to 50 ---");
			
			for(int b=1 ; b<=50; b++) {
				
				if(b%2==0) {
					
					System.out.print(b + " ");
				}
			}
System.out.println();
			
			System.out.println("*****");
		}
	}


	
