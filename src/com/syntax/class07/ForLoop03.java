package com.syntax.class07;

public class ForLoop03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* what is the output?
		 *   */
		int sum=0;
		
		for(int i=1 ; i<=6; i++) {
			
			sum+=1;
			
			//System.out.println(sum);

		}
		System.out.println(sum);
		
		int result=1;
		for (int i=1 ; i<=4 ; i+=2) {
			
			result*=i;
		}
		System.out.println(result);
	}

}
