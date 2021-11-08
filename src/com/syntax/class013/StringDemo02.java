package com.syntax.class013;

public class StringDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name=" ";
		//System.out.println(name.isBlank()); //blank  will consider  empty space 
		System.out.println(name.isEmpty());
		name ="Priyasri";
		System.out.println(name.isEmpty());
		
		String str="  Batch 11 is...  "; //
		System.out.println(str.trim()); //it will basically remove the space before and end of the string
		System.out.println("****************************");
		
		String str2 ="This is easy class";
		System.out.println(str2.toLowerCase().startsWith("t")); //we can have mutilple method of string on same class that is called check the slip class13
		System.out.println(str2.startsWith("This"));
		System.out.println(str2.startsWith("L"));
		System.out.println(str2.endsWith("easy"));
		

	}

}
