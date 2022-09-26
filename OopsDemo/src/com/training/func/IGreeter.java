package com.training.func;

public interface IGreeter {

	void add();
	void product();
	default void greet()
	{
		System.out.println("welcome");
	}
}
