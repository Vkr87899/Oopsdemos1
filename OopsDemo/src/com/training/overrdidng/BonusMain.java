package com.training.overrdidng;

public class BonusMain {
public static void main(String[] args) {
	Employee employee=new Employee();
	employee.calcBonus(10);
	employee =new Developer();
	employee.calcBonus(10);
	employee =new Tester();
	employee.calcBonus(10);
}
}
