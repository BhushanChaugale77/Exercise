package com.prowings.exercise.opps;

public class StaticVariable {

	static int i = 10;

	public static void main(String[] args) {

		System.out.println(i);

		StaticVariable v = new StaticVariable();

		System.out.println(v.i);       // we can call static variable by this 3 ways

		System.out.println(StaticVariable.i);
	}

}
