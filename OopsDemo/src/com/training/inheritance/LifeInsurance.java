package com.training.inheritance;

public class LifeInsurance extends Insurance {
	
	public LifeInsurance(String name, String type) {
		super(name, type);
		// TODO Auto-generated constructor stub
	}

	void coverageDetails() {
		System.out.println("on life and accients");
	}
}
