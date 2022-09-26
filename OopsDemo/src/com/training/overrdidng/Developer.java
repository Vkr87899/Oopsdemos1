package com.training.overrdidng;

public class Developer extends Employee {

	void calcBonus(int amount) {
		System.out.println("Developer bonus  :" + (amount * 10));
	}
}