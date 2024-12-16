package com.vtalent.inheritanceeg;

public class Programmer extends Employee {
	float bonus = 10000;

	public static void main(String[] args) {
		Programmer pgr = new Programmer();
		System.out.println("programmer salary is:" + pgr.salary);
		System.out.println("bonus of programmer is:" + pgr.bonus);
	}
}
