package com.day_0320.chap15;

public class Example2 {
	public static void divide(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("0으로 나눌 수는 없다니까?");
		}
		int c = a / b;
		System.out.println(c);
	}

	public static void main(String[] ar) {
		int a = 10;
		int b = 0;

		try {
			divide(a, b);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
