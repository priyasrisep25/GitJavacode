package com.syntax.reviewclass4;

public class ForLoop01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<5; i++) {
			
			i++;
			
			System.out.println(i);
			
			
		}
		System.out.println("*************************");
		
//for(int i=0; i<5; i--) { //note inside the body i am incrementing 
	//but inside  the () i am decrement , therefore the result is infinite 1.
			
			//i++;
			
			//System.out.println(i);
			
		//}
		
for(int i=0; i<5; i+=2) { //note inside the body i am incrementing 
	//but inside  the () i am decrement , therefore the result is infinite 1.
			
			i++;
			
			System.out.println(i);
}

	}

}
