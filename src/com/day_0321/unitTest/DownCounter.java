package com.day_0321.unitTest;

public class DownCounter implements Counter {
	private int d = 0;

	@Override
	public int count() {
		d--;
		return d;
	}

	public static void main(String[] args) {
		DownCounter c = new DownCounter();
		System.out.println("현재 값은" + c.d);
		c.count();
		System.out.println("현재 값은" + c.d);

	}

}
