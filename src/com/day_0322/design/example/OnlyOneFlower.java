package com.day_0322.design.example;

public class OnlyOneFlower {
	private static OnlyOneFlower instance;

	private OnlyOneFlower() {
	}

	public static OnlyOneFlower getInstance() {
		if (instance == null) {
			instance = new OnlyOneFlower();
		}
		return instance;
	}

}
