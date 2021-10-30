package com.syntax.class07;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print numbers from 1 to 100 in 1 line with space
		
		for(int A=1 ; A<=100 ; A++) {
			
			System.out.print(A + " ");
		}
		
		System.out.println();
		System.out.println(" -----Print number from 100 to 1");
		
		for(int B=100 ; B>=1 ; B--) {
			
			System.out.print(B + " ");
		}
		
		System.out.println();
		System.out.println(" -----Print even number from 20 to 1");
		
		for(int num1=20; num1>=1 ; num1-=2) {
			
			System.out.print(num1 + " ");
		}
		
		System.out.println();
		System.out.println(" -----Print odd number from 20 to 50");
		
		for(int num2=20 ; num2<=50 ; num2 ++) {
			
			if(num2%2!=0) {
				
				System.out.print(num2 + " ");
			}
			
			
		}
		
			
			
		}
	}


