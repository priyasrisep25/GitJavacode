package com.syntax.class05;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//based on entered # we will define if #is small , medium, large
		
		//if # is betweem 1 & 10---->samall
		// if #is between 11 & 100---> medluim
		//if # is between 101 & 10000---->large
		//if #
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter any #");
		
		int num= in.nextInt();
		
		if(num<1) {
			System.out.println("numebr is negative");
			
		} else if (num>=1 && num<=10) {
			
			System.out.println(num + "is small");
			
		}else if(num>=11 && num<=100) {
			
			System.out.println(num + "is medium");
		}else if(num>=101 && num<=1000) {
			
			System.out.println(num + "is large");
		}else if (num>1001) {
			
			System.out.println(num + "is extra large");
		}
		
		
	}

}
