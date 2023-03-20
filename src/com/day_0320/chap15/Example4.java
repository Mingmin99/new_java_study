package com.day_0320.chap15;

public class Example4 {

	public static void main(String[] ar) {
		int a, b;
		a = 10;
		b = 0;
		try {
			int c = a / b;
			System.out.println(c); // 예외발생으로 실행 불가한 코드
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 발생");
			System.out.println("0으로 나눌 수는 없습니다");
			e.printStackTrace();
		} finally {
			System.out.println("finally 실행");
		}
	}
}
