package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we can use the switch case, if we have to  find exact(equivalent) match. in here we given day=6, 
		//it will go inside  switch  case  and it will find exact match and it will come out from the switch case.
		//Switch is a great replacement to long  else if construction.

		int day=6;
		switch(day) { // switch  is valued  based statement, it won't go like a ladder , 
		//i goes by the value . so it basically jump to match value. 
		//where as if is condition base(true or false check the example 6 on class 03
		case 1: // Please  note all the case from top to bottom.
			System.out.println(" Monday");
			break;
			
		case 2:
			System.out.println(" Tuesday");
			break;// as soon as switch find  the match value , it will come out 
			//from the switch block. so it's very important to use "break" inside the switch case
			
		case 3:
			System.out.println(" Wednesday");
			break;
		case 4:
			System.out.println(" Thrusday");
			break;
		case 5:
			System.out.println(" Friday");
			break;
			
		case 6:
			System.out.println(" Saturady");
			break;
			
		case 7:
			System.out.println(" Sunday");
			break;
		default:
			System.out.println("wrong day");
		
		}
	}
}

 