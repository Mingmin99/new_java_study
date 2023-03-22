package com.day_0322.threadExam.exam1;

public class CountThread extends Thread {

	public void run() {
		synchronized (CountThread.class) {
			for (int i = 0; i <= 50; i++) {
				System.out.println(i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		}

	}
}
