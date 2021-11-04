package com.syntax.class10;

public class Project01Quest09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Maximum and minimum number in the array?
		
		int [] num = {80,30,250,50,100};
		int min= num[0]; //set 80 has min value , and compare with all other elements in the array and will find min number by using if , and if else condition. 
		int max=num[0]; //set 80 has max value."
						
		for(int i=1;i<num.length;i++) { //starting with one , because already take [0] for  min & max.
			
			if(num[i]<min) {
				
				min=num[i]; 
			}else if(num[i]>max) {
				max=num[i]; 
			}
			
			
			}
		System.out.println( " The Minimum number is  " + min+ " and the Maximum number is "  + max);
		
		}
	}


