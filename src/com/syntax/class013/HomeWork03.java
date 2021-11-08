package com.syntax.class013;

public class HomeWork03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Create a String and print it in reverse order (Sunday → yadnuS).
		
		String name = "Sunday";
		
		String rev="";
		
		for(int i= name.length()-1; i>=0; i--) {
			
			
			rev+= name.charAt(i); //meaning rev= rev+name.charAt(i);
		}
		
		
		System.out.println(" The Reverse order for the sunday  is: " + rev);
		

	}

}
