package com.sysntax.class08;
import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a program that reads a range of integers (start and end point), provided by a user and then from that range
		 *  prints the sum of the even and odd integers */
		 Scanner scan = new Scanner(System.in);
		 System.out.println("please enter   starting #");
		 int StartNum =scan .nextInt();
		 System.out.println("Please enter  closing#");
		 int endNum =scan .nextInt();
		 int sumofeven=0;
		 int sumofoddNum=0;
		 
		
		 if(StartNum<endNum)
			 
			 for(int i=StartNum ;StartNum<=endNum; StartNum++) {
				 
				 System.out.println(StartNum);
			
				 if(StartNum%2==0) {
				 
				 sumofeven +=StartNum; //sumofeven =sumofeven + startnumber;
			 }else { 
				 sumofoddNum+=StartNum;
			 }
			 
		 }
		 System.out.println("************");
		 System.out.println("sum of even number" + sumofeven);
		 System.out.println("sum of odd number" + sumofoddNum);
		 
		 if(StartNum>endNum) {
			 
 for(int i=StartNum ;StartNum>=endNum; StartNum--) {
				 
				 System.out.println(StartNum);
			
				 if(StartNum%2==0) {
				 
				 sumofeven +=StartNum; //sumofeven =sumofeven + startnumber;
			 }else { 
				 sumofoddNum+=StartNum;
			 }
			 
		 }
		 System.out.println("************");
		 System.out.println("sum of even number" + sumofeven);
		 System.out.println("sum of odd number" + sumofoddNum);
		 
			 
			 
		 }
		 
		 
	}
}

		 
		 
			 
			 
		 
		 
