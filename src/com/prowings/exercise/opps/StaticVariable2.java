package com.prowings.exercise.opps;

public class StaticVariable2 {

	static int i = 10;

	public static void main(String[] args) {

		System.out.println(i);

	}

	public void m() {
		
		System.out.println(i);  	//we can static variable outside static area directly
	}
	
}
