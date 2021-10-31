package com.sysntax.class08;

public class NestedClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Time;

		for(int hr=0 ; hr<=24; hr++) {
			
			for(int min=0 ; min<=60 ;min++) {
				
				if(hr<10 && min <10) {
					
					Time= "0" +hr + ":" + "0" + min;
				}
				
				System.out.println(Time);
				
			}
			}
	}

}
