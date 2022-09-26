package com.training.exten;

public class PoliyMain {

	public static void main(String[] args) {
		HealthPolicy  policy=new StarInsurance();
		policy.policyDetails();
		policy.healthCoverage();
		System.out.println(".......");
		MotorPolicy mref=new AckoInsurance();
		mref.policyDetails();
		mref.baikeInsurance();
		mref.carInsurance();
		
		
		
	}
}
