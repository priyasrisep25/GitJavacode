package com.sysntax.class08;

public class HomeWork02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		//Print numbers from 1 to 50 except those that are divisible by 3
		
		for(int i=1 ; i<=50; i++) {
			 
		if(i%3==0) { //why i am getting incorrect out put if do "/" , and if i put % i am getting correct output.
			continue;
		}
			 System.out.print(i + " ");
				
			}
		
		System.out.println("**********Another Method*****************");
		
		for(int j=1 ; j<=50; j++ ) {
			
			if(j%3!=0) {
				
				
				System.out.print(j + " ");
			}
		}
		}

	}
	


