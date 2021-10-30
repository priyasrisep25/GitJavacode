package com.syntax.ReviewClass3;

public class CommonIssues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "Priyasri";
		if("Priyasri".equals(name)) { //line 9 & 13 are same
			
			System.out.println("Batch 11 student");
		}
		if(name.equals("priyasri")) {
			
			System.out.println("Batch 11 student");
		}
		
		int num=10;
		if(num==10) {//line 19 & 25 are same
			
			
			System.out.println("Batch 11 student");
			
			
		}if(10==num) {
			
			System.out.println("Batch 11 student");
		}

	}
}


