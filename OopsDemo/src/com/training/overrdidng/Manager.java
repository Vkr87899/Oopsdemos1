package com.training.overrdidng;

public class Manager extends Employee{
	void calcBonus(int amount)
	{
		System.out.println("Manager bonus  :"+(amount*5));
	}

}
