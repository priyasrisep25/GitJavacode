package com.syntax.class10;

public class Project01Quest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Create a 2D array or integer type where you will store odd and even numbers. 
		Develop a program which will identify/print the even numbers only. */
		
		
		
		int[][] num= {{1,3,5,12,16,13},
					{ 2,4,6,8,9,10}
		};
		for(int i =0 ; i<num.length ; i++) {
			
			for(int j=0; j<num[i].length ; j++) {
				
				if(num[i][j]%2==0) {
					
					System.out.print( num[i][j] + " ");
					
				}
				
			}
		}
				
		}

	}


