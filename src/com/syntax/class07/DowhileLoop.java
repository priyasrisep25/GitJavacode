package com.syntax.class07;

public class DowhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=1;
while(a<=3) {
	
	System.out.println("Hi");
	a++;  /* note: the increment and decrement  always inside the body
    of the loop .so in the "while" loop this i++/i--  inside the while */
}

System.out.println("********************CODE USING DO WHILE LOOP****************");


int b=1;
do {

	System.out.println("Hellow");
	
	b++;  /* note: the increment and decrement  always inside the body
	        of the loop .so in the "do while" loop this i++/i--  inside the do */
}while(b<=3);
	}

}
