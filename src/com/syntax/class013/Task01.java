package com.syntax.class013;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Accept username, password and confirm password from a user and check following requirements:
			Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
			Password should be minimum 8 characters, if less → message=”Password is too short”.
			Password cannot contain username if so, → message=”Password cannot contain username”.
			Password should match confirmed password, if not  → message=“Passwords do not match”.
			Only after all requirements met → message “Your username and password has been created” */
		
		/*Method is a block of code
-->Method consist of method header and method body
--->method head is return type name of the method and parameter list
--->void add(int num1,int num2){
--->return num1+num2
}
void add(int num1,int num2) => Method header
void=>key word
add=> name of the method
int num1,int num2 => parameter list
{
return num1+num2     => Method body
}
How many types of methods are there?
built-in methods and user defined methods */
		
		String username ="hari";
		String Password="priya1234";
		String confirmPass="priya1234"; 
		
		if(!(username.isEmpty() || Password.isEmpty())) { //! meaning is if user name and password not empty  then we can go inside if condition. that's why we  are using reverse condition by using "!" in front.
			
			if(Password.length()>=8) {
				if(!Password.contains(username)) { // using .contain() method is basically  to check is their any same charter available  between these two strings are not. 
					
				if(Password.equals(confirmPass)) { //using .equals() method is basically to check is both string carry same value or not 
					System.out.println("your user name and password has been created");
				}else {
					
					System.out.println("Password don't match");
				}
					
				}else {
					System.out.println("Password cannot contian username");
				}
				
			}else {
				
				System.out.println("Password too short");
			}
		}else {
			
			System.out.println("username and passwod can not be empty");
		}
		
	
		
		
		
		

	}

}
