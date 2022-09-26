package com.training.basics;

public class Vehicle {
	public Vehicle(String brand, double price) {
		this(brand);
		this.price = price;
		System.out.println("constructorr two price: " + price);
	}

	String brand;
	String model;
	double price;

	public Vehicle(String brand, String model, double price) {

		this(brand, price);
		this.model = model;
		System.out.println("constructor three model:  " + model);

	}

	public Vehicle() {
		super();
		System.out.println("vehicles");
	}

	public Vehicle(String brand) {
		this();
		this.brand = brand;
		System.out.println("constructor one brand: " + brand);
	}

	void printDeails() {
		if (model != null)
			System.out.println("model " + model);
		if (brand != null)
			System.out.println("brand " + brand);
		if (price != 0.0)
			System.out.println("price " + price);
	}

}
