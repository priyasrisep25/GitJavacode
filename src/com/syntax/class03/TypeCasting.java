package com.syntax.class03;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number = 10; // define variable
		int number2;// define variable
		number2 = (int) number; // assigning if their is no hram then we can change the data type. moving the
								// value from bigger box to smaller box, we have to explicit casting
//number2=number this 
		System.out.println(number2);
		System.out.println("********************************************");
		int number3 = 10;
		double number4 = number3; // it's take
		int number5 = 1256;
		byte number6 = (byte) number5;
		System.out.println(number6); // in here we lost the data because we move the big data int and put into samll
										// storage byte , so we lost the data. it baiscally narrowing double

		short number7 = 12;
		// byte number8=number
		byte number8 = (byte) number7;
		
		int number9=10000;
		float f=number9;
		long number12=(long)f;
		
		double number10=10.5;
		int number11=(int)number10; //note: byte-short-int-float-double ------wideing (Samll to big);
		System.out.println(number11);  //doble-float-long-int- short-byte 
		
		//we will do casting when combining code from multiple source to created single application.
		
		
		
		

	}

}
