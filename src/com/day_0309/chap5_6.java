package com.day_0309;

public class chap5_6 {

	public static void main(String[] args) {
		int ans = add(1, 2);
		System.out.println(add(add(10, 20), add(30, 40)));
	}

	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}

}
