package com.vtalent.has_a_relation;

public class Emp {
	int id;
	String name;
	Address address;

	public Emp(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name + " " + address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {
		Address address1 = new Address("skp", "TS", "India");
		Address address2 = new Address("hyd", "TS", "India");

		Emp emp = new Emp(1, "srikanth", address1);
		Emp emp2 = new Emp(2, "reddy", address2);

		emp.display();
		emp2.display();
	}
}
