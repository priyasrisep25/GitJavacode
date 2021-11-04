package com.syntax.class10;

public class HomeWork03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Create 2D array of cars : american, german, korean, italian. 
		//Then retrieve all values from that array using 2 different loops
		
		String [][] cars= { {"American" , "German" , "korean" , "Italian"},
				{ "Toyata", "Prius", "Skoda"},
				{"BMW" , "Honda", "BIAT"}
					
				};
		
		for(int i=0 ; i<cars.length; i++) {
			for(int j=0 ; j<cars[i].length; j++) {
				
				System.out.print(cars[i][j] + ", ");
				
				
			}
			
			
		}
			System.out.println("******************Enhance loop****************************");
			
			for(String[] car1 : cars) {
				
				for(String a : car1){
				
				System.out.print(a + " ");
			}
				System.out.println();
		}
			}

	}


