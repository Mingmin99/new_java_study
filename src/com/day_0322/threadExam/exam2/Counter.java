package com.day_0322.threadExam.exam2;

public class Counter {
	private long count = 0;

	public synchronized void add(long i) {
		System.out.println("더하기");
		count += i;
	}

	public synchronized void mul(long i) {
		System.out.println("곱하기");
		count *= i;
	}

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		new Thread(() -> {
			counter.add(2);
		}).start();
		new Thread(() -> {
			counter.mul(100);
		}).start();

		Thread.sleep(1000);
		System.out.println(counter.count);

	}
}
