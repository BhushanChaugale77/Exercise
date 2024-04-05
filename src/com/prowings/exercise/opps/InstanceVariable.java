package com.prowings.exercise.opps;

public class InstanceVariable {
	
	int i;
	double d;
	boolean b;
	String s;
	
	Integer I;
	Boolean B;
	Float F;
	Character C;
	
	
	public static void main(String[] args) {
		
//		System.out.println(x); //Exception in thread "main" java.lang.Error: Unresolved compilation problem
		
		InstanceVariable v = new InstanceVariable();
		
		System.out.println(v.i); // 0
		System.out.println(v.d); // 0.0
		System.out.println(v.b); // false	       // for instance variable jvm will provide default values by using object referance
		System.out.println(v.s); // null
		
		System.out.println("-------------------------------");
		
		System.out.println("Integer Default values = "+v.I);
		System.out.println("Boolean Default values = "+v.B);
		System.out.println("Float Default values = "+v.F);
		System.out.println("Character Default values = "+v.C);
		
	}

	 
}
