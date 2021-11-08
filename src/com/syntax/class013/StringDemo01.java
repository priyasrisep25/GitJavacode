package com.syntax.class013;

public class StringDemo01 {
	
	public static void main(String[] args) {
		
	
		String  name= new String("Priyasri"); //this is how we usually create a object , but since it;s widely using so the java created be short cut.
		String name1="Priya";
		System.out.println(name.length());
		System.out.println(name1.length());
		
		System.out.println(name1.toLowerCase()); // this method will change all letter to lowercase.
		System.out.println(name1.toUpperCase());  // this method will change all letter to upper case.
		
		String str ="This is easy 1234  & %#@ 12";
		System.out.println(str.toLowerCase());
		
		
		System.out.println(name.concat(name1)); //this concat  method is not recommended  , 
		//but we can use + operator for combine the words. becasue if we put null on any string  and try to concadinate you will get error. but if you put + you won't get error.
		
		
		int number=10;
		System.out.println(name+name1+number);
		//System.out.println(name.concat(name1).concat(number));
	}

}
