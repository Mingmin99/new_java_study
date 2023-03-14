package com.day_0309;

public class chap5 {
	public static void main(String[] args) {
		add(3,5);
	}
	
	public static void printArray(int[] nums) {
		for(int num : nums) {
			System.out.println(num);
		}
	}

	public static void hello() {
		System.out.println("안녕하세요");
	}

	

	public static int add(int x, int y) {
		int result = x + y;
		System.out.println(x + "+" + y + "=" + result);
		System.out.printf("%d + %d = %d", x, y, result);
		// %d = 정수
		// %f = 실수
		// %s = String
//		System.out.printf(" %d + %d +%d/n", x, y, result);
		if (result % 2 == 0) {
			return result;
		}
		return result;
	}

}
