package com.day_0322.synchronize;

public class DeadLockExample {

	public static void main(String[] args) {
		final Object resource1 = "resource1";
		final Object resource2 = "resource2";

		Thread thread1 = new Thread(() -> {
			synchronized (resource1) {
				System.out.println("Thread 1: locked resource1");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (resource2) {
					System.out.println("Thread 1: locked resource2");

				}
			}
		});

		Thread thread2 = new Thread(() -> {
			synchronized (resource2) {
				System.out.println("Thread 2: locked resource2");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (resource1) {
					System.out.println("Thread 2: locked resource1");
				}
			}
		});
		thread1.start();
		thread2.start();
	}

}
