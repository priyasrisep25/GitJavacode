package com.syntax.class09;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		System.out.println(num);
		
		int[] arry= new int[4];
		arry[0]=12;
		arry[1]=10;
		arry[2]=13;
		arry[3]=14;
		//arry[3]=14.09  it won't this data type util we convert casting  arry[3]= (int) 14.09 , but we will get 14.
		System.out.println(arry[2] + arry[0]);
		
		//i need to create an arry that will hold 3 elements of duoble type of values.
		
		double[] arr = new double[3];
		arr[0]= 11.99;
		arr[1]= 11.99;
		arr[2]= 11.99;
		arr[1]=100.99;
		System.out.println("After changing value of an elemnts" +arr[1]);
		
		// i want to create an arry that will store 4 colors
		String[] color =new String[4];
		color[0]= "Red";
		color[1]= "balck";
		color[2]= "blue";
		
		System.out.println("Size of arry is" + color.length); //this will show how much length/box we have
		
		System.out.println(color[3]);// compiler will have 
		
		
	}

}
