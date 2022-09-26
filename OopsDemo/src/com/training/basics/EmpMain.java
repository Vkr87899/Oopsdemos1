package com.training.basics;

public class EmpMain {

	public static void main(String[] args) {
		Employee employee = new Employee("Sri", 20, 10000);
		Employee employee2 = new Employee("sadik", 30, 40000);
		employee2.printDetails();
		System.out.println(employee2.greetMessage("good morning    "));
		System.out.println(employee.greetMessage("Welcome  "));

	}

}
