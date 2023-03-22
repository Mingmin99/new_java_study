package com.day_0322.threadExam.exam1;

public class Main {

	public static void main(String[] args) {
		CountThread thread1 = new CountThread();
		CountThread thread2 = new CountThread();
		CountThread thread3 = new CountThread();
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
