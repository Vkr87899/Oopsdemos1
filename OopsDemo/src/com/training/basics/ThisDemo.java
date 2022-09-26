package com.training.basics;

public class ThisDemo {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("bugatti", 90000);
		System.out.println();
		Vehicle vehicle1 = new Vehicle("odi", "s14", 850000);
		System.out.println();
		Vehicle vehicle2 = new Vehicle("scorpio");
		System.out.println();
		vehicle.printDeails();
		System.out.println();
		vehicle1.printDeails();
		System.out.println();
		vehicle2.printDeails();

	}
}
