package com.training.func;

public interface IBonusCalculator {

	void calBonus(int amount);
	default void printAllowance() {
		System.out.println("car allowance");
	}
}
