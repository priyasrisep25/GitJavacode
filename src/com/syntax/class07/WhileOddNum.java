package com.syntax.class07;

public class WhileOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//write program which prints the odd numbers
//between 1 and 100 in an incresed order
		
		int A =1;
		while(A<=100) {
			
			if(A%2!=0) { //to find the odd #
				
			System.out.print(A + "  ");
			}
			
			A++;
			
			}
		System.out.println();
		System.out.println("******************************************************");
		
			
		// even#  using if condition
		
		int B= 1;
		while(B<=100) {
			
			if(B%2==0) {
				System.out.print(B + " ");
				}
			B++;
		}
		}
	}


