package com.day_0320.chap15;

public class Example1 {

	public static void main(String[] args) {
		try {
			// 일반적인 실행 부분
			Thread.sleep(110000);
		} catch (InterruptedException e) {
			// 예외가 발생했을 때 처리를 하는 부분
			System.out.println("에러 발생! 종료합니다");
			System.exit(1);

		}

	}
}