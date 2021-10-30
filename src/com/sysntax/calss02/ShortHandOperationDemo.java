package com.sysntax.calss02;

public class ShortHandOperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=10;
		number=number+1; /* in here we are doing basically take that variable(number)and
		assign different value(number+1)to that  variable  result 11  and way of writing this is number++ */
		
		
		System.out.println(number);
		number++; //this is shorter way of this number=number+1, the result is 11+1 =12 
		//number++ meaning increment by 1
		System.out.println(number);
		System.out.println("****************");
		number=10;
		number=number+30;
		System.out.println(number);
		number+=30; // number=number+30 result is 40+30=70 and shorthand operation working on addtion.
		/* ++ means incremeant the value by 1 whereas number+=30 increment the value by 30 and 
		the other way of wrting this syntex is number=number+30 is the other way of writing the above syntax , both value will be same */
		System.out.println(number);
		System.out.println("****************");
				
		number=10; //Shorthand operation working for subraction also
		number-=5;
		System.out.println(number); // the other way of writing  the above syntax is number=number -5 both  result will be same.
		System.out.println("**************");
		number=10;
		number*=5; //it's possible multiplication;
		System.out.println(number);
		System.out.println("**************");
		
		number=10;
		number--;	 //means decrement the value by 1 and this is  shorthand writing the other way of wrting is number=number -1
		System.out.println(number);
		
		number=10;
		number-= 7; // other way of  writng is number=number-7 which is 3
		System.out.println(number);
		System.out.println("**************");
		
		
		
		number=10;
		number/=5; //it's possible for  division;
		System.out.println(number);
		System.out.println("**************");
		number=98; ////it's possible for  models  % is nothing by showing  the remaining;
		number%=10; //number=number %10
		System.out.println(number);
		System.out.println("**************");
				
		System.out.println(10+10);//if both  are integer  it will add so we will get result will be 20;
		
		
		
		
				
		
				
		
		
				
		
		

	}

}
