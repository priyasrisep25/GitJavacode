package com.syntax.class09;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] name= {"Priya","Hari","Archana","Deepak"}; //note we need can't to add right 
		System.out.println(name.length);
		System.out.println("My Name is"  + name[0]);
		
		System.out.println("*******************************");

		
		/*Create an array of words: Java, Saturday, day, coding, is. Print the following 
		 * sentence using elements of array: “Saturday is Java coding Day”. 
		 */
		
		String[] word = {"Java", "Saturday","day.", "coding", "is"};
		System.out.println(word.length);
		System.out.println( word[1] + " " +word[4] + " " +word[0]+" " +word[3]+" " +word[2]);
		
		System.out.println("*******************************");
		
		for(int i=0 ;i< word.length; i++){
			
			System.out.println(word[i]);
			
			
		}
		System.out.println("*******************************");
		
		int[] num= {100,200,300,400,500};
		
		for(int i=0 ; i<num.length; i++) {
			
			System.out.print(num[i] + " ");
			System.out.println();
			
		}
		
		System.out.println("*******************************");
		//to acess all elements from an array we can use for each loop/advance  for loop/enhance
		
		for(int n: num) { //this advance loop works only with Array. //on right side you specify the array name and other side data type
			System.out.print(n);
			System.out.println();
		}
		System.out.println("*******************************");
		//System.out.println();
		String[] colors = {"red","blue","white"};
		for(String col: colors) { //this advance loop works only with Array. //on right side you specify the array name and other side data type
			System.out.print(col + " ");
		}
	}

}
