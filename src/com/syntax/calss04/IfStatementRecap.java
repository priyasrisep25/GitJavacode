package com.syntax.calss04;

public class IfStatementRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* autocomplete (it's going to complete  our statement
		 * 
		 * Syso +ctrl+space+enter (it will auto complete the print statement
		 * main + ctrl+space+enter
		  * note  if don't put {}in if statment , 
		  * the java will understand and able to read only one line if & else */
		
	int day=6;
if(day==6) {
	
	System.out.println("Today is Saturday");
	System.out.println("We are having java class");
}else {
	
	System.out.println("Today is not Saturday");
}
System.out.println("********************************************");
if(day==6) 
	
	System.out.println("Today is Saturday"); //this code will execute, even without {},
											  //but if  you  have multiple line abd their is no {}, 
//System.out.println("We are having java class");											//only one line item will execute
											//
else
	System.out.println("Today is not saturday");
	
System.out.println("Today is some other day");// note , since we didn't put {}java will consider
//only one item is belongs to else which is line 34, the other one 35 is consider as regular syntax, that's the reason it's shows in console, 
//to avoid these kind of issues we  have {}for if and else condition.

}

}

	

