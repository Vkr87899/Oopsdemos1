package com.training.interfaces;

public class User implements IGames {

	@Override
	public void outdoorGames() {
		System.out.println(".....Outdoor.....");
		System.out.println("Football");

		System.out.println("Cricket");
	}

	@Override
	public void indoorGames() {
		System.out.println(".....indoor.....");
		System.out.println("Tennis");
		System.out.println("Batminton");

	}

}
