package com.sysntax.calss02;

public class ArithmaticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*creating this class to check 
		is arthematic operation can work on data type or not */
		
		int Number1=10; //note:Int data type will do arthematic operation.
		int Number2=20;
		System.out.println(Number1+ Number2); 
		System.out.println(Number2- Number1);
		System.out.println(Number1 * Number2);
		System.out.println(Number1/ Number2); /*in real world  we will get 0.5 , but the out put here 
		O because int date type won't show decimal */
		System.out.println("****************************"); 
		
		/*if one is integer and other one is double then the result will be double data type , 
		check belwo syntax but most of the we won't mix up this data type just for exple it's given */
		int Number5=10;
		double Number6=10.879;
		System.out.println(Number5 + Number6);
		System.out.println(Number5 - Number6);
		System.out.println(Number5 * Number6);
		System.out.println(Number5 / Number6);
		System.out.println("****************************");
		
		
		
		double Number3=10; //double data type also will do arthematic operation.
		double Number4=20;
		System.out.println(Number3+ Number4); 
		System.out.println(Number3- Number4);
		System.out.println(Number3 * Number4);
		System.out.println(Number3/ Number4); // it will show  the result in decimal because we are using here double date type instead of int
		System.out.println("*****************");
		
		boolean var1=true; //arthematic operation not allowed on boolean
		boolean var2=false;
		//System.out.println(var1+var2); //it's not accept
		
		char Char1='1';
		char Char2='2';
		System.out.println(Char1 + Char2); /*char  do arthematic operation but actually we want to  get result of 3(1+2), 
		but in this case we are getting 99, becuase it take 1 & 2 value assigned on computer  */
		Char1='a';
		Char2='b';
		System.out.println(Char1 + Char2); /*char  do arthematic operation but it  take a(97 in assemble Language) & b(098 assemble language)
 assembly language value assinged on computer */
				
	 
		System.out.println(Char1 - Char2);
		System.out.println("*****************");
		
		String str1="3";
		String Str2="4";
		System.out.println(str1 + Str2); //str won't do arthermatic operation it will do only concerdination 
		String str3="A";
		String Str4="B";
		System.out.println(str3 + Str4);
		//System.out.println(str1 - Str2); //it will give error
		//System.out.println(str1 - Str2);//it will give error
		
		
		
		
		
		
		
		
		

	}

}
