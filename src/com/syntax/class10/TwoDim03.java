package com.syntax.class10;

public class TwoDim03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 2d array is a array of array
		String [][]  groc= {
				
				{"bannana" , "apple", "mango"}, //0 size
					
				{"Potato" , "tomato"},//1
				{"milk","Cheese", "ayran", "yogurt"}//2
				};
		for(String[] grocery : groc) {
			
			for(String g:groc) {
				
				System.out.print(g + " ");
			}
		}

	}

}
