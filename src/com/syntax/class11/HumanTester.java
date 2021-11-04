package com.syntax.class11;

import java.util.Scanner;

public class HumanTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human temana = new Human();
		temana.name = "Tamana";
		temana.age=16;
		temana.height=5.8;
		temana.weight=30;
		temana.gender='F';
		temana.bloodType="A+";
		
		
		temana.eat();
		temana.sleep();
		temana.walk();
		
		System.out.println("**********************************");
		
		
		Human sebastian = new Human();
		sebastian.name= "Sebastian";
		sebastian.age= 18;
		sebastian.height= 6.2;
		sebastian.weight= 100;
		sebastian.gender= 'M';
		sebastian.bloodType= "A+";
		
		
		sebastian.eat();
		sebastian.sleep();
		sebastian.walk();
		sebastian.sendMemes();
		
		Scanner scan =new Scanner(System.in);
		
		

	}

}
