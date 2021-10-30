package com.sysntax.class08;

public class Condtion01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<5; i++) {
			
			if(i==3) {
				
				continue; //will be inside the if  and when it see the continue it will go back
			}
			
			System.out.println("Hi" +i);
			System.out.println("hi" + i);
		}
		
//i wnat to print number from 1 to 10 except number 3,5,9
		for (int i=1; i<0; i++) {
			
			if(i==3 || i==5 || i==9) {
				continue;  //basically skip the below statement  and move back to loop again line 20.
			}
			System.out.println(i + " ");
			
		}
		System.out.println("end of the code");
	}
	/* both break and continue can be used inside  any loop and usually 
	placed inside the conditional statements like inside if , else  */
	//break 

}
