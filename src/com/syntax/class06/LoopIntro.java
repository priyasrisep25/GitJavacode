package com.syntax.class06;

public class LoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=100;
		num=num+1;
		num+=1;
		System.out.println(num);
		
		num++; //increment value of variable by 1
		
		System.out.println(num);
		num--; /*decrement value of variable by 1 , 
		we cna use decrement or increment only with variables
		ex: 10++ ; cannot be used with values , only with variable */
		
 /* type of loops 
  * 1) while
  * 2) do while
  * 3)for loop
  * 4)enhance for loop/advance for loop/for each loop
  */
		
		int time=14;
		if(time<17) { //this will execute only one time
			
			System.out.println("it is a day");
		}
		
		while(time<17) { /*the statements will keep execute as long  as the condition is true.
			    * step 1: 14<17, then line 36 execute ,
		     * then down it will go time++, now it will  
			* increment the value by 1 which is now 15, again go back to while now time is 15,  15<17 ,
			* yes then it will execute.*/
			
			System.out.println("it is a day");
			time++;
			//time--;  in this scenario if we put -- it will do infinite.
			
		}
		
		System.out.println("************************************************************");
		//Question what to print number 1 to 20;
		
		int A=1;
		while(A<=20) {
			
			System.out.print(A + "  ");
			A++;
		}
		System.out.println();
		System.out.println("************************************************************");
		
		//Question: What to write program  to print from 50 to 1;
				
		//int i=2;
		//while(i<=20) {  
		//System.out.println(i + " ");
			//i=+2;
			
		//}
		//System.out.println("I want to print number from 50 to 1");
		
		int B=50;
		while(B>=1) { //sine the "B" variable value is higer 50 , so we are puttting B>=50 , otherwise it will not go inside the while loop
			
			System.out.print(B + " ");
		B--;
		
		
		}
		
		System.out.println();
		System.out.println("************************************************************");
		
			
		}
}
		
		
	


