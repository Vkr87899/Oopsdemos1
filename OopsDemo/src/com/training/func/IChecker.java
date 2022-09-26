package com.training.func;

public interface IChecker {

	void add();
	void cube();
	default void  greet()
	{
		System.out.println("welcome");
	}
}
