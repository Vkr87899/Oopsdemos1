package com.training.func;

public class AnonyMain {

	public static void main(String[] args) {
		InewInsurance newinsurance =()->{System.out.println("Health insurane");};
		newinsurance.policyDetails();
		newinsurance = new InewInsurance() {

			@Override
			public void policyDetails() {

				System.out.println("Motor insurance");
			}
		};
		newinsurance.policyDetails();
		newinsurance = new InewInsurance() {

			@Override
			public void policyDetails() {
				System.out.println("INsurance for life");

			}

		};

		newinsurance.policyDetails();
	}
}
