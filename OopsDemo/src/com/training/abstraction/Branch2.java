package com.training.abstraction;

public abstract class Branch2 extends Bank {

	@Override
	public void eucationLoan() {
		
		System.out.println("Eduactional loan from Branch2 with 5% interset");
	}

	@Override
	public void healthLoan() {
		
		System.out.println("health  loan from Branch2 with 5% interset");
	}
	public void loanDetails()
	{
		System.out.println("in Branch2 EMI monthly only");
	}
	

}
