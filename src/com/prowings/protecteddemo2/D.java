package com.prowings.protecteddemo2;

import com.prowings.protecteddemo.A;

public class D extends C {

	public static void main(String[] args) {

		A a = new A(); // m1 has protected access in Package in pack protecteddemo.A
		// a.m1();

		C c = new C(); // m1 has protected access in Package in pack protecteddemo.A
		// c.m1();

		D d = new D(); // only possible case outside package in child class refrance only
		d.m1();

		A a1 = new C(); // m1 has protected access in Package in pack protecteddemo.A
		// a1.m1();

		A a2 = new D(); // m1 has protected access in Package in pack protecteddemo.A
		// a1.m1();

		C c1 = new D(); // m1 has protected access in Package in pack protecteddemo.A
		// c1.m1();
	}

}
