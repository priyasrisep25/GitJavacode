package com.sysntax.class08;
import java.util.Scanner;

public class NestedLoop01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter height of triangle: ");
		int height = scan .nextInt();
		
		for (int i=1 ; i<= height; i++) { /* given height =4 ; write the condition  i=1(first iterative) ; 
			                               i=2(2nd iterative) ; i=3(3rd iter)  ; i=4(4iterative ; i=5  now condition fall so it come out form the loop */ 
			System.out.println();
			for(int j=1 ; j<=i; j++) { // first time iterative cylce for inner loop now  (i=1) -->  j=1 ,false come out from this   loop. for iterative the value will keep aad
				                       // second time iterative cycle for inner loop now(i=2)-->  j=1(inc by 1) ; j=2(inc by1); j=3 now false come out from the this loop 
				System.out.print("*"); //thrid time iterative cycle for inner loop now(i=3) --->, j=1,(inc by 1); j=2(iter); j=3(itera) ; j=4 . false come out.
			}                          //fourth time iterative cycle for inner loop  now(i=4)--->j=1(inc by 1); j=2(inc); j=3(inc); j=4(inc); j=5 , false come out.
			
			System.out.println();
		}
	}

}
