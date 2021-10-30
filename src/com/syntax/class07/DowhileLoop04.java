package com.syntax.class07;

public class DowhileLoop04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* print number from 30 to 70 using do while loop */
		
		int num= 30;
		do { 
			
			System.out.print(num + " ");
			
			num++;
		}while( num<=70);

		
	System.out.println();
	System.out.println("**************Print odd  number from 99 to 1 using do while loop***********************");
	
	 int num1=100;
	 
	 do {
		 
		if (num1%2!=0){
		
			 System.out.print(num1 + " ");
			}
		 
		 num1--;
	 }while(num1>=1);
	
	 System.out.println();
		System.out.println("**************************************************");
	
		int num2 =99;
		do {
			
			System.out.print( num2 + "  ");/* note we can make odd# without if else inside the loop.when we  odd# assign to variable. 
			                                in here num2 =99 , which is odd# . so we can use this.*/
			 num2 -=2;
		
		
		}while(num2>=1);
		
		
	}
	
	

}
