package com.day_0321.java05.lambda;

import java.util.function.IntBinaryOperator;

public class Add {
	public static int add(int x, int y) {
		return x + y;

	}

	public static void main(String[] args) {
		IntBinaryOperator func =Add::add;

		int result = func.applyAsInt(5, 3);
		System.out.println("5+3 + " + result);

	}

}
