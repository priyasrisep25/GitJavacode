package com.syntax.class013;

public class HomeWork02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Create a String and if the String is not empty perform the following: 
if the String has an odd number of characters and has 3 or more characters,
 print the character in the middle of the String.*/
		
		String name= "priyasriyhari";
		
		
		if(!name.isEmpty()) {
			
			if(name.length()%2!=0 ) 
			{
		System.out.println("The Character that are in the middle of the strings are: " + name.substring(3,11));

			}
		else {
			
			System.out.println("name doesn't have odd number charter");
			
		}
		}
		else {
			
			System.out.println(" String  is Empty!");
		}
		

	}
	}


