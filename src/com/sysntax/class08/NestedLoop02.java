package com.sysntax.class08;

public class NestedLoop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* nested loop- loops inside another loop
		 * 
		 */
		
		for(int i=1; i<=3; i++) { //outer loop
			
			System.out.println("I am outer loop");
			
			for(int j=1; j<=4; j++) { //inner loop
				System.out.println("I am inner loop");
			}
		}
		
		System.out.println("End of the code");

	}

}
