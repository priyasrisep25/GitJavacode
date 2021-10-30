package com.sysntax.calss02;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print the area & perimeter of the rectangle with width=5 and height =8.

		double Width = 5;// note we can put the data type either int or double , since double can have
							// more storage capacity we are put double.
		double Height = 8;

		// int Perimeter = Width * 2 + Height * 2; //BOTH WORKS FINE line item 13 & line
		// 14

		double Perimeter = (Width + Height)
				* 2; /*
						 * note if we are not put () on Arithmetic operation , then will follow PEMDAS -
						 * Parentheses ,exponents, multiplication, division,addition & subtraction .in
						 * this scenario if there is no () then it will do multiplication first then the
						 * result will be incorrect and also u can use () for any this that need to be
						 * calculated together line item 20 is example
						 */

		System.out.println("1) Perimeter & Area of Rectangle:");

		System.out.println("  " + "-The Perimeter of rectangle with width " + Width + " and height " + Height
				+ " is equal to" + Perimeter + " and area is " + (Width * Height) + ".");

		/*
		 * System.out.println("The Permeteof rectangle with width " + Width +
		 * " and height "+ Height + " is equal to" +(Width + Width + Height+ Height) +
		 * "and  area is "+ (Width*Height)); // both codings are correct line 21 & 24
		 */

		System.out.println(
				"**********************************************************************************************************************************************************");

		// 1) Declare variable and increase by 100 using shorthand operator
		// 2) Declare variable and dereased by 67 using shorthand operator
		// 3) Declare variable cakePiece=11 and divide cakepiece between 4 people using
		// short hand operator . each person should get an equal piece of cake.
		// 4) Declare variable cakePiece=25 and divide cakePiece between 7 people.using
		// shorthand operator found out how many piece of cake left after it was
		// distributed Equally among 7 people.

		int Increase = 200;
		Increase += 100; // the long way of writing is Increase =Increase +100
		System.out.println("1)" + Increase);
		int Decreased = 100;
		// Decreased-=67;// meaning Increase =Increase -67 which is Increase=; this is
		// works fine too
		System.out.println("2)" + (Decreased -= 67));
		int CakePiece = 11;
		CakePiece /= 4;
		System.out.println("3)" + CakePiece);
		CakePiece = 25;
		CakePiece %= 7;
		System.out.println("4)" + CakePiece);

		// System.out.println(CakePiece%)

	}

}
