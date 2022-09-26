package com.training.abstraction;

public class Bank_Main {
public static void main(String[] args) {
	Bank bank=new Branch1();
	Bank bank2=new SubBranch();
   System.out.println("******Branch1 *********");
	bank.carLoan();
	bank.healthLoan();
	bank.eucationLoan();
	bank.admin();
	
	System.out.println();
	System.out.println(".......SubBranch......");
	SubBranch subbranch=(SubBranch)bank2;
	subbranch.admin();
	subbranch.carLoan();
	subbranch.healthLoan();
	subbranch.loanDetails();
	subbranch.termPlans();
	System.out.println();
	System.out.println(".....Branch  2........");
	Branch2 branch2=(Branch2)bank2;
	branch2.admin();
	branch2.eucationLoan();
	branch2.healthLoan();
	branch2.loanDetails();
}
}
