package com.syntax.class09;

public class HomeWork02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Create an array of animals and store 6 elements into it. 
		 * Using 2 different loops print all elements from the array.*/
		 
		String [] animals= {"lion", "tiger", "Bunny","dog","cat","goat"};
		
		for(int i =0; i<animals.length; i++) {
			
			System.out.println(animals[i] + " ");
		}
		
		System.out.println("**********Another Loop(Enhance loop)*************");
		
		String[] name = {"lion", "tiger", "Bunny","dog","cat","goat"};
		
		for(String na: name) {
			
			System.out.println(na);
		}

	}

}
