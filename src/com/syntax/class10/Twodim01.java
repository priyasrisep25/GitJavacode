package com.syntax.class10;

public class Twodim01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//let's create an 2D array of groceries 
		
		String [][]  groc= {
				
				{"bannana" , "apple", "mango"},
					
				{"Potato" , "tomato"},
				{"milk","Cheese", "ayran", "yogurt"}
				};
		
		System.out.println(groc.length); //#of array
		System.out.println(groc[2][3]); //yougurt
		
		//i want to find how many elements my 1 array has
		
		System.out.println("# of elements inside 1 array= " + groc[0].length);
		System.out.println("# of elements inside 2 array= " + groc[1].length);
		System.out.println("# of elements inside 3 array= " + groc[2].length);
		
		//how do we get all elements from 2D array?
		 int total=0;
		
		for(int i=0 ; i<groc.length; i++) { //iterates over array or rows
			for(int j=0 ; j<groc[i] .length; j++) { //iterates over elements of each single
				
				total++;
				System.out.print(groc[i][j] + " ");
			}
		
		 System.out.println();
		}
		System.out.println("# of elements ");
		 System.out.println("**************************************************");
		
				
		}
	}


