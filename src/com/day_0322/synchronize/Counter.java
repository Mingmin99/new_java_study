package com.day_0322.synchronize;

public class Counter {
	int num = 0;

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		for (int i = 0; i < 1000; i++) {
			new Thread(() -> {
				try {
					Thread.sleep(10);
					synchronized (counter) {
						counter.num += 1;
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}).start();
		}
		Thread.sleep(4000);
		System.out.println(counter.num);
	}
}
