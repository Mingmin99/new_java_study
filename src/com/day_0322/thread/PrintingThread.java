package com.day_0322.thread;

public class PrintingThread implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	public void start() {

	}

}
