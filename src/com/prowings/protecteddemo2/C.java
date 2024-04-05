package com.prowings.protecteddemo2;

import com.prowings.protecteddemo.A;

class C extends A {
	
	public static void main(String[] args) {
		
		A a = new A();	// Unresolved compilation problem: The method m1() from the type A is not visible	
	//	a.m1();			//	at com.prowings.protecteddemo2.C.main(C.java:10)
		

		C c = new C();   
		c.m1();
		
		 A a1 = new C();   // Unresolved compilation problem: The method m1() from the type A is not visible
	//	  a1.m1();         //	at com.prowings.protecteddemo2.C.main(C.java:10)
		 

	}
	
	

}
