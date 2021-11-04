package com.syntax.class11;

public class PhoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone Priya =new Phone();
		
		Priya.name="IPhone";
		Priya.Model=13;
		Priya.color="blue";
		Priya.screenSize=6.7;
		Priya.StorageSize=256;
		Priya.battery=28;
		Priya.iphoneFeature();
		
		
		System.out.println("I have " + Priya.name);
		System.out.println("And the model number is Iphone " + Priya.Model);
		System.out.println("And storage " +Priya.StorageSize);
		System.out.println("***************************************");
		
Phone hari=new Phone();
		
		hari.name="Samsung";
		hari.Model=3;
		hari.color="black";
		hari.screenSize=7.6;
		hari.StorageSize=512;
		hari.battery=8;
		hari.SamsungFeature();
		
		System.out.println("I have " + hari.name);
		System.out.println("And the model number is Iphone " + hari.Model);
		System.out.println("And storage " +hari.StorageSize);
		System.out.println("***************************************");
		
	Phone archana = new Phone();
	
	archana.name="Nokia";
	archana.Model=8;
	archana.color="red";
	archana.screenSize=5.4;
	archana.StorageSize=128;
	archana.battery=8;
	
	System.out.println("I have " + archana.name);
	System.out.println("And the model number is Iphone " + archana.Model);
	System.out.println("And storage " +archana.StorageSize);
	System.out.println("***************************************");
		
	}

}
