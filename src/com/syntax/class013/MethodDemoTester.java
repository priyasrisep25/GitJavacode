package com.syntax.class013;

import java.util.Arrays;

public class MethodDemoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodDemo obj =new MethodDemo();
		System.out.println(obj.add(10,10));
		
		//we can't do the enhance for loop for double the value
		
		int[] array= {10,10,10};
		array =obj.doubleArray(array);
		System.out.println(Arrays.toString(array));

	}

}
