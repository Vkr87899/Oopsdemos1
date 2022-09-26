package com.training.basics;

public class OverloadDemo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.calArea(20);
		int  rect=shape.calArea(10, 20);
		System.out.println(rect);
		System.out.println(shape.calArea(8, 9.5f));
	}
}
