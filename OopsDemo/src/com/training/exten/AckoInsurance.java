package com.training.exten;

public class AckoInsurance implements MotorPolicy {

	@Override
	public void policyDetails() {
	System.out.println("provides various new policies");
	}

	@Override
	public void carInsurance() {
		System.out.println("car insurance against accidents");

	}

	@Override
	public void baikeInsurance() {
		System.out.println("bike insurance against damage");

	}

}
