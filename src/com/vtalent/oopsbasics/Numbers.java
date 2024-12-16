package com.vtalent.oopsbasics;

public class Numbers {
	// properties
	private int a;
	private int b;

	// methods
	public void sum() {
		System.out.println(a + b);
	}

	public void sub() {
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		// Creating Instance of Class
		// Object
		Numbers obj = new Numbers();
		obj.a = 10;
		obj.b = 8;
		obj.sum();
		obj.sub();
	}

}
