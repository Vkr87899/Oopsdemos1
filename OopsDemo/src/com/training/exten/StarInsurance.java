package com.training.exten;

public class StarInsurance implements HealthPolicy {

	@Override
	public void policyDetails() {
		System.out.println("20 year experince");
		
	}

	@Override
	public void healthCoverage() {
		System.out.println( "coverage for long term illness");
		System.out.println("Quarterly premium");
		
	}
	

}
