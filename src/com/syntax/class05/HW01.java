package com.syntax.class05;
import java.util.Scanner;
public class HW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**Write a program for user to enter his/hers birth month. Based on the month define the season.
		Example: if user is born in June, July or August → season =“Summer”.
		At the end of the program we should see output as “You were born is season **/
		
		
		
		Scanner Scan= new Scanner(System.in);
		System.out.println("Enter your Brith of Month");
		String Month = Scan.nextLine();
		String Season =null;
			
			if(Month.equalsIgnoreCase("Jun") || Month.equalsIgnoreCase("july")|| Month.equalsIgnoreCase("Aug")){
				
				//System.out.println(" you were born season is Summer");
				Season="Summer";
				
			}else if (Month.equalsIgnoreCase("December")||Month.equalsIgnoreCase("Jan")|| Month.equalsIgnoreCase("Feb")){
				
				//System.out.println(" you were born season is Winter");
				Season="Winter";
				
			}else if (Month.equalsIgnoreCase("March")|| Month.equalsIgnoreCase("April")|| Month.equalsIgnoreCase("may")) {
				
				//System.out.println("you were born season is Spring");
				Season="Spring";
				
			}else if(Month.equalsIgnoreCase("September")|| Month.equalsIgnoreCase("Octomber") || Month.equalsIgnoreCase("November")) {
				
				//System.out.println(" you were born season is Fall");
				
				Season="Fall";
			}else {
				Season= "Invalid";
			}
			
			if(!Season.equals("Invalid")) { //this code will use if we don want
				//to see the season is invalid on the console. by using ! we reversing the condition becasue user enter "sndhf" 
				//it will go to line 39 sine it's invalid , Invalid = Invalid , it's true it suppose to exeute line 46 , 
				//but we given if condtion !=, meaning  not true , so 46 line not executing
			
			System.out.println("You Were born Season is " + Season +"!");
		
			
			
			}
			
			
	}

}
