package com.training.basics;

public class Employee {
	String name;
	int Employe_id;
	double salary;

	

	

	public Employee(String name, int Employe_id, double salary) {
		super();
		this.name = name;
		this.Employe_id = Employe_id;
		this.salary = salary;
	}

	void printDetails() {
		System.out.println("name " + this.name);
		System.out.println("salary " + this.salary);
		System.out.println("id " + this.Employe_id);
	}

	String greetMessage(String msg) {
		return msg + this.name;
	}

}