package com.day_0321.unitTest;

public class Count implements Counter {
	private int a=0;

	@Override
	public int count() {
		a++;
		return a;
	}

	public static void main(String[] args) {
		Count c = new Count();
		System.out.println("현재 count 값" + c.a);
		c.count();
		System.out.println("현재 count 값" + c.a);
	}

}
