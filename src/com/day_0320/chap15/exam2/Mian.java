package com.day_0320.chap15.exam2;

public class Mian {

	public static void main(String[] args) {
		String three = "Three";
		int a;
		try {
			a = Integer.parseInt(three);

		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException 예외 발생");
			e.printStackTrace();
		}
	}
}
