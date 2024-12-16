package com.vtalent.oopsbasics;

public class Employee {
	static String employee_Name;
	static float employee_Salary;

	static void set(String n, float s) {
		employee_Name = n;
		employee_Salary = s;
	}

	static void get() {
		System.out.println("employee name is " + employee_Name);
		System.out.println("employee salary is " + employee_Salary);
	}

	public static void main(String[] args) {

		Employee.set("srikanth", 50000);
		Employee.get();
	}

}
