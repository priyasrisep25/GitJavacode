package com.syntax.class09;

public class Contine01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1 ;i<3; i++) {
			
			for(int j=0 ; j<=2;j++);{
			
			System.out.println("hello");
			}
			//break;
		}
			System.out.println("*********************************");
		System.out.println("GM");
		//break;
		boolean morning=true;
		for(int j=1; j<=3; j++) {
			
			System.out.println("I am loop");
		while(morning) {
			
			System.out.println("GM");
			break; // break keyword will exist the  loop where it was declared , we have the break inside the while loop
			//since the condition is true, the  code will execute infinite times , so by  put the break , it will come out from the  while loop 
		}
	}

		System.out.println("*********************************");	
		
		for(int i=1 ;i<3; i++) {
			
			for(int j=1; j<=2;j++){
				
				if (j==1){
					
					continue; //this keyword will skip the current iterative/cycle otherwise we can say it will ignore the below line, line 41 won't execute on the console
				}
				
			System.out.println("hello");
			}
		
			System.out.println("Good Morning");
			
		
}
		
}
}


	
	

