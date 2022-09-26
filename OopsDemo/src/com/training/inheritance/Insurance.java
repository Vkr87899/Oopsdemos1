package com.training.inheritance;

public class Insurance {
	String name;
	String type;
	
	public Insurance(String name,String type) {
		super();
		this.name = "LIC";
		this.type = "all";
	}

	void insuranceDetaails() {
		System.out.println("All types of insurance");
		System.out.println("name "+ name);
		System.out.println("type :"+type);

	}
}
