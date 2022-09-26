package com.training.inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
        Insurance insurance=new Insurance("Lic","All");
          insurance.insuranceDetaails();
          System.out.println("...................");
          GeneralInsurance ginsurance=new GeneralInsurance("bike","vehicle");
          ginsurance.insuranceDetaails();
          ginsurance.policyType();
          System.out.println("....................");
          LifeInsurance linsurance =new LifeInsurance("voya","health");
          linsurance.coverageDetails();
          linsurance.insuranceDetaails();
         
	}

}
