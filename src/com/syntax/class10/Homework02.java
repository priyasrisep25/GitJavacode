package com.syntax.class10;

public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Create a 2D array in which first array will consist of 4 names and second array will contain grades. 
		Then your program should print name of the students that has A and B grade */
		
		String[][] name1= { {"Priyasri", "Rose", "Hari", "Deepa"},
							{ "A", "B","c","D"}
		};
		
		
		for(int i = 0; i<name1.length ; i++) {
			for(int j=0; j<name1[i].length; j++) {
				
				if(name1[i][j] .equals("A") || name1[i][j].equals("B")) {
				
				System.out.println("Name of the student " + name1[i-1][j] + " "+ "and her grade" + " " +name1[i][j]);
				}
			}
		}
				
			}
			
			
		
		

	}


