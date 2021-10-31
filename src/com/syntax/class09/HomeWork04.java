package com.syntax.class09;

public class HomeWork04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an array on integers and calculate the sum of all elements in an array.
		
		int[] value = new  int[5];
		
		value[0] = 50;
		value[1] = 200;
		value[2] = 150;
		value[3] = 300;
		value[4] = 200;
		
		System.out.println(+value[0] + value[1] + value[2] + value[3] +value[4]);
		
		System.out.println("*****************************************");
		
		
		int [] value2 = {50,200,150,300,200};
		int sum=0;
		
		for(int i=0 ; i<value2.length;i++) {
			
			sum+=value[i];
		}
		System.out.println("The Sum of all the elements " + sum);
		
		
		

	}

}
