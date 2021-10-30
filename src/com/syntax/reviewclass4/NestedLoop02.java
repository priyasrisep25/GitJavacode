package com.syntax.reviewclass4;

public class NestedLoop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		for(int i=0; i<5; i++) {
			
			for(int j=0 ; j<5; j++) {
				
				System.out.println(j);
			}
			
			
		}
		
		System.out.println("*****************");
for(int i=0; i<2; i++) {
			
			for(int j=0 ; j<5; j++) {
				
				System.out.println(i);
			}
			
			
		}
System.out.println("*****************");
	
for(int i=0; i<2; i++) {
	
	for(int j=0 ; j<5; j++) {
		
		System.out.println("i= " + i + " j = " +j);
	}
	
	}

}
}
