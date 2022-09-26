package com.training.abstraction;

public class Branch1 extends Bank {

	@Override
	public void carLoan() {
		
		System.out.println("Car loan from Branch1 with 5% interset");
	}

	@Override
	public void eucationLoan() {
		
		System.out.println("Educational  loan from Branch1 with 3% interset");
	}

	@Override
	public void healthLoan() {
		System.out.println("Car loan from Branch1 with 4% interset");
		
	}
	

}
