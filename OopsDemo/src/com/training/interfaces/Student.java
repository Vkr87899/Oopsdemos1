package com.training.interfaces;

public class Student implements Icourse, IGames {

	@Override
	public void outdoorGames() {
		System.out.println("Baseball");
	}

	@Override
	public void indoorGames() {
      System.out.println("chess");		
	}

	@Override
	public String[] wecourses() {
		
		return new String[]{"HTML","CSS","Js"};
	}

	@Override
	public String[] backendcourse() {
		
		 return new String[]{"java","spring"};
	}

}
