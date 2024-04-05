package com.prowings.array;

public class BasicArray {
	int [] x;    // this is right way of Array Declaration
	double []d;
	float f [];
	
	// two dimensional array
	
	int [][] i;
	double [][] l;
	
	//three diamensional array
	
	int [][][] t;
	double [][][] e;
	boolean[][][] b;
	
	public static void main(String[] args) {
		
		BasicArray b = new BasicArray();
		
		System.out.println(b.x);
		System.out.println(b.d);
		System.out.println(b.f);
		
		
		//two diamensional array
		
		System.out.println(b.i);
		System.out.println(b.l);
		
		//three dimensional array
		
		System.out.println(b.t);
		System.out.println(b.e);
		System.out.println(b.b);
	}

}
