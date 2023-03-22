package com.day_0322.synchronize;

public class Main {
	int a = 0;
	int b = 0;

	public static void main(String[] args) {
		Main main = new Main();
		main.syncExam();
	}

	public void syncExam() {
		System.out.println("시작");

		synchronized (this) {
			a += 2;
			b = a * 4;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println("끝");
		
	}

}
