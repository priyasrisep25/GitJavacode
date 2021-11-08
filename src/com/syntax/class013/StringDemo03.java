package com.syntax.class013;

public class StringDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="This class is easy";
		System.out.println(name.contains("class"));
		System.out.println(name.contains("Lemon"));
		System.out.println(name.contains("i"));
		System.out.println("**********************************");
		
		String str2 ="Hello";
		String str3="hlyjhuyelo";
		System.out.println(str2.equals(str3)); /*basically comparing  the word from two different variable from str2 & str3 ,  
		and even we can compare the same string ex: str2.equals("Hello")and even if you have space  then we will have false  output
		and also  it will check the cases also so we are getting false because str1 
		have Hello & Str2 have hello */
		System.out.println(str2.equalsIgnoreCase(str3));
		
		System.out.println("**********************************");
		
		System.out.println(str2.charAt(0)); //this will provide first  letter  form the string based on the index we specified   , we will get H
		System.out.println(str2.charAt(4));//this will provide first  letter  form the string based on the index we specified  , we will get O;
		System.out.println(str2.charAt(2));
		
		
		System.out.println(str2.toUpperCase().charAt(4));
		System.out.println(str3.indexOf('l', str3.indexOf('l')+1)); /* basically by doing this we are going to find the index # for specific letter index will consider 
		the space also.  basically will tell where the letter stands, */
		System.out.println(str3.indexOf('l', str3.indexOf('l')+1));// to find dynamic  without specify the index number we can use this  
		 
		System.out.println(str3.indexOf('l'));// check where the letter 'l' stand on the index. output will get 2 
		System.out.println(str3.indexOf('e'));
		System.out.println(str3.indexOf('h',3 )); // in here  basically we are asking to find index # for letter h ,and also we are asking to find the index  this letter after 3 letter 
		
		 
		System.out.println(name.substring(5,11)); // ignore first five letter and ignore after all letter after 11.
		
		
		
		
		
		

	}

}
