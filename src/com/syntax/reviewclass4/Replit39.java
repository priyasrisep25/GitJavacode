package com.syntax.reviewclass4;
import java.util.Scanner;
 
public class Replit39 {
	public static void main(String[] args){

		 {
		// TODO Auto-generated method stub
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Please enter your mark");
		int value = scan .nextInt();
		String mark=null;
		 if(value>=1 && value<=25){
		   mark ="F";
		 }else if(value>=25 && value<=45){
		   mark="E";
		 }else if(value>=45 && value<=50){
		   mark ="D";
		 }else if(value>=50 && value<=60){
		   mark="C";
		 }else if(value>=60 && value<=80){
		   mark="B";
		 }else if(value>=80 & value<=100){
		   mark="A";
		 } else if(value!=100) {
			 
			 mark="invalid";
			 
		 }
		
		 if(!mark.equals("invalid")) { //mark !=invalid e
			 
			 System.out.println("Your grade is " +mark);
		 }else {
			 
			  System.out.println("Please enter valid mark");
		 }
}
		  
	}
		

}


