package com.prowings.exercise.opps;

public class InstanceVariable2 {
	
	int x = 10;
	
	public static void main(String[] args) {
		
//		System.out.println(x); //Exception in thread "main" java.lang.Error: Unresolved compilation problem
		
		InstanceVariable2 v = new InstanceVariable2();
		
		System.out.println(v.x);
		 
	}
	
	public void  m() {
		
		System.out.println(x);
		
	}

	 
}
