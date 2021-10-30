package com.syntax.class06;

public class SwitchDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char gender='m';
		String description;
		switch(gender) {
		
		case 'm': 
			
			//Rules:
			//value must be same  data type as a variable in switch .
			//in here char , 
			//2. we can not have duplicate cases, BUT see below we have lower "m " and lower 
			//"M" Which have different meaning 
			
			/* switch limitation
			1)inside switch case  we can't do logical operator && || 
			2)inside switch case we can't do relational operator  = .>= ,
			3) switch can't work with all data type , can not use boolean , double, float long
			*/
			//note: only we checking for equality then we can use switch case.
			//int, short, char & string can use switch.
			
			description= "Male";
			break;
			
		case'f':
			description= "female";
			break;
			
			default:
				description="unknow";
		}
		System.out.println(gender + " means " + description);

	}

}
