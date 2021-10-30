package com.syntax.class07;

public class ForOddEvenLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//write program which prints the odd numbers
		//between 1 and 100 in an incresed order
		
		for(int i=1;i<= 100 ; i++) {
			if(i%2==0) {
				
				System.out.print(i + "  ");
			}
			
			
		}
		
		System.out.println();
		System.out.println("*************************************************");
		//ODD #
		for(int A=1;A<= 100 ; A++) {
			if(A%2!=0) {
				
				System.out.print(A + "  ");
			}
			
	}

}
}
