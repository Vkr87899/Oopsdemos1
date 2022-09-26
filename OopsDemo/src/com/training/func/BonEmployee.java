package com.training.func;

public class BonEmployee implements IBonusCalculator {

	@Override
	public void calBonus(int amount) {
		System.out.println("Bonus is :"+amount*2);
	}

	@Override
	public void printAllowance() {
		// TODO Auto-generated method stub
		//IBonusCalculator.super.printAllowance();
		System.out.println("house");
	}

}
