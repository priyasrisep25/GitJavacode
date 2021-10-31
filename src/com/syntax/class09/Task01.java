package com.syntax.class09;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* create an arry of chars and store grade into  it: A,B,C,D,E,F . Then print a grade B
		 * 
		 * belwo is one way of creating way */
		char[] grade = new  char[5]; // length of the arry is 5
		grade[0]= 'A';
		grade[1]= 'B';
		grade[2]= 'C';
		grade[3]='D';
		grade[4]='E';
		
		System.out.println(grade[1]);
		
	
		
		char[] gender; //declare an array 
		gender= new char[2]; //Initialize it's value
		
		//second way of array
		char[] gradesArray= {'A','B','C','D'}; //note we need can't to add right 
		System.out.println(gradesArray.length);
		System.out.println("elements with index 2 is" +gradesArray[2]);
		
		//elements inside array always stored based on the index(index start from 0)
		
		/*cannot declare  an array separately if we wnat to store values in shorter way
		 *  int[] nums;
		 * nums={10,12,11}; //compiler will complain 
		 * 
		 * 
		 */
		
		
		
		

	}

}
