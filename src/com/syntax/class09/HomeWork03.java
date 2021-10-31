package com.syntax.class09;

public class HomeWork03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create an array to store double values and then print those in reverse order
		double [] value =  new double[5];
		
		value[0] =10.68;
		value[1] =87.90;
		value[2] =11.11;
		value[3] =10.11;
		value[4] =11.11;
		
		//System.out.println(value.length);
		
		for(int i=value.length -1; i>=0; i--) { /*made i= value.length -1 , because total length of the index is 5 , since we assigned value from o to 4 . 
			                                   so i am getting outbond error . so i am decreasing -1  from the length(i=5-1)*/
			
			System.out.print(value[i]);
			System.out.println();
		}
		
	}

}
