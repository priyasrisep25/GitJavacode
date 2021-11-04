package com.syntax.class10;

public class HomeWork04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inside you should have an array of veggies, fruits, dairy and sweets. Retrieve all values from that array using 2 different loops
		
		String[][] groc= {{"spanish", "carrot", "beans", "Potato"},
				{"Mango", " apple" , "Berry", "Grape"},
				{"Cheese" , "milk", "ice cream"},
				{"cake", "pie", "Custard", " muffin"}
					
				};
		
		
		for(int i = 0; i<groc.length; i++ ) {
			
			for(int j=0;j<groc[i].length ; j++) {
				
				System.out.print(groc[i][j] + " " + " ,");
				
			}
			System.out.println();
		}
		System.out.println("*****************************Enhance Loop***********************************************");
		for(String[] item :groc) {
			
			for(String a : item) {
				
				System.out.print(a + "  ");
			}
			
			System.out.println();
		}
		}

	}


