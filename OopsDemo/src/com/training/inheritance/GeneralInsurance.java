package com.training.inheritance;

public class GeneralInsurance extends Insurance {

	

	public GeneralInsurance(String name, String type) {
		super(name, type);
		// TODO Auto-generated constructor stub
	}

	void policyType() {
		System.out.println("in sub class");
		System.out.println("covers motor, health Insurance");
		System.out.println("name " + name);
		System.out.println("type :" + type);

	}
}
