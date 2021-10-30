package com.syntax.class03;

public class Quize06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float f= 75.0f;// note even it's different data type 
		//the value are same because 75.0 which is just 75. 
		//hence the output says  f,d,i are equals. check Qize4  for another dicemial example
		double d=75.0;
		
		int i=75;
		
		if(f==d) {
		if(f==i) {
			
			System.out.println("f,d, and i equals");
		}else {
			
			System.out.println("f,d, are equal but i is not equal");
		}
		}else {
			
			System.out.println("f and d are not equals");
		}

	}

}
