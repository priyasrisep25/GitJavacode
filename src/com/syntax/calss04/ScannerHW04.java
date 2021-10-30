package com.syntax.calss04;
import java.util.Scanner;
public class ScannerHW04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Weather = new Scanner(System.in);
		System.out.println("Enter your city");
		
		String City= Weather.nextLine();// we store/read the charter in string data type  , because this method is string data type and 
		//also since it has more than one word we given  .nextLine(), this will take multiple line , # , and symbol also.
		
		System.out.println("Enter the Temp" );
		
	 int Temp1 = Weather. nextInt();
	int  Temp2 = ((Temp1-32)*5/9); //formula to convert freh to celcius
	//System.out.println(Temp2);
	
		 
		
System.out.println("The Temperature is the city " + City + " is " + Temp2+ " °C ");  // TO get the Celsius symbol sign Hold Alt 0176"
 
		
		

	}

}
