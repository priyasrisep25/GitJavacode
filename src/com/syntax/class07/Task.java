package com.syntax.class07;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i want  to ask a user their name and age 5times
		Scanner scan=new Scanner(System.in);//scanner happen only one times
		
		
		 int i=5; //Variable declarization happens only one time.
		 while(i>=1) {
			 
			 System.out.println("Please enter your name & age");
			 String name=scan.next();
			 int age = scan.nextInt();
			 System.out.println("You name is " + name+ " and you are " + age + "Year old");
			 i--;
		 
	}

}
}
