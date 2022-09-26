package com.training.func;

public class LamdaDemo {
public static void main(String[] args) {
	InewInsurance insurance=()->System.out.println("heath");
	insurance.policyDetails();
	insurance=()->System.out.println("motor");
	insurance.policyDetails();
}
}
