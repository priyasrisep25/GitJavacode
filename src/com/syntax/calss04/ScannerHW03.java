package com.syntax.calss04;
import java.util.Scanner;
public class ScannerHW03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner DMV= new Scanner(System.in);
		System.out.println("How old are you?");
		int age= DMV.nextInt();
		
		if(age>=18) {
			
			System.out.println(" we can issue a driving lincense to you !");
		}else {
			
			System.out.println(" You can a get  Leaners Permit!");
		}
		

	}

}
