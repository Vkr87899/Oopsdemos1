package com.training.interfaces;

public class InterMain {
	public static void main(String[] args) {
		IGames gamer = new User();
		gamer.outdoorGames();
		gamer.indoorGames();
		gamer=new Student();
		gamer.indoorGames();
		gamer.outdoorGames();
		Icourse  courses=(Student)gamer;
		String[] bcourse=courses.backendcourse();
		for (String courseName : bcourse) {
			System.out.println(courseName);
		}
	}
}
