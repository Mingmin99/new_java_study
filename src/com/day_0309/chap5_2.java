package com.day_0309;

public class chap5_2 {
	public static void methodA() {
		System.out.println("methodA");
		methodB();
	}

	public static void methodB() {
		System.out.println("methodB");
	}

	public static void main(String[] args) {
		methodA();

	}

}
