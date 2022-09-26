package com.training.func;

public class MyCheck implements IGreeter, IChecker {

	@Override
	public void cube() {
		

	}

	@Override
	public void add() {
		System.out.println("Adding");
		

	}

	@Override
	public void product() {
		

	}
	@Override
	public void greet() {
		//IChecker.super.greet();
System.out.println("hello");
	}

	public static void main(String[] args) {
		IGreeter greet=new MyCheck();
		greet.add();
		greet.greet();
	}

}
