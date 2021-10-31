package com.syntax.class09;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.*/
		
		String[] Cars = {"BMV","Hond","Prius","Charger","Tesla", "merc"};
		
		for(int i=0 ; i<Cars.length;i++) {
			
			System.out.println(Cars[i] + " ");
		
		}
      System.out.println("********************Another loops*********************************************");
      
      String[] name= {"BMV","Hond","Prius","Charger","Tesla", "Toyota"};
      for(String ca :name) {
    	  
    	  System.out.println(ca + " ");
      }
      
      System.out.println("********************With Value*********************************************"); 
	  
    	  int[] list= {200,300,400,100,600,200};
    	  
    	  for(int i=0 ; i<list.length; i++) {
    		  
    		  System.out.println (list[i]);
    		  
    		  
    	  }
    	  
      }
	}


