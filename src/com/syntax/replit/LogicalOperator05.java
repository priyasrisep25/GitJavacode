package com.syntax.replit;

import java.util.Scanner;

public class LogicalOperator05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Take 2 boolean inputs from a user:

"Are you thirsty?"

"Are you sleepy?"

If user is thirsty and not sleepy--> drink=water

If user is thirsty and sleepy--> drink=coffee

If user is not thirsty and sleepy --> drink=tea

Otherwise drink="nothing"

Output:
Output:
Looks like you need to drink ___*/
		
		Scanner scan = new Scanner(System.in);
		  System.out.println("Are you thirsty");
		  boolean input1 = scan .nextBoolean();
		  System.out.println("Are you sleepy");
		  boolean input2 = scan .nextBoolean();


		  if(input1 && !input2){

		  System.out.println("Looks like you need to water");
		  }else if(input1 && input2){
		System.out.println("Looks like you need to coffe");

		  }else if(!input1 &&  input2 ){
		System.out.println("Looks like you need to tea");
		  }
		else{
		    System.out.println("nothing");
		  }
	}

}
