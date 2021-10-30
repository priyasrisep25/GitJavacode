package com.syntax.calss04;

import java.util.Scanner;
public class Scanner01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // note : don't name the class as "Scanner", because it's already on the Java lIberary.
		
// it's non primative data type , so it start with Caps "S"
	//short to import existing class to the current class
		//wid: ctrl+shift+to
		
		String str="abc"; //assign "abc" value to str variable
		Scanner scan = new Scanner(System.in); // this line enable the keyboards and 
		//it will helo us to get out put from console
		System.out.println("Print your name");
		String name =scan.next();// it will capture string value from console
	System.out.println("Hello" + name);
	
	System.out.println("Print your age");
	int age =scan.nextInt();
	System.out.println("Print your age");
	
	
	
	
	}

}
