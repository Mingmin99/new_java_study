package com.day_0321.java05.lambda;

public class MyFunctions {
	public static int add(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		MyFunction func = MyFunctions::add;

		int result = func.call(5, 6);
		System.out.println("5 + 6 = " + result);

	}

}
