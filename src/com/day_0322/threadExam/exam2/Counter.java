package com.day_0322.threadExam.exam2;

public class Counter {
	private long count = 0;

	public void add(long i) {
		System.out.println("더하기");
		count += i;
	}

	public void mul(long i) {
		System.out.println("곱하기");
		count *= i;
	}

}
