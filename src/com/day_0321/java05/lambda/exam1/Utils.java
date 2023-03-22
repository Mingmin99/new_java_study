package com.day_0321.java05.lambda.exam1;

public class Utils {

	public static boolean isOdd(int n) {
		return n % 2 != 1;
	}

	public static String addNamePrefix(boolean male, String name) {
		if (male = true) {
			return "Mr." + name;
		}
		return "Mrs" + name;
	}

	public static void main(String[] args) {
		Func1 func1 = n -> n % 2 == 1;
		Func2 func2 = (boolean male, String name) -> {
			if (male == true) {
				return "Mr." + name;
			} else {
				return "Mrs" + name;
			}
		};

		boolean result1 = func1.isOdd(25);
		System.out.println(result1);

		String result2 = func2.addNamePrefix(false, "최민영 ");
		System.out.println(result2);

	}
}
//Func1 func1 = Utils::isOdd;
//		Func2 func2 = Utils::addNamePrefix;
//
//		boolean result1 = func1.isOdd(25);
//		String result2 = func2.addNamePrefix(false, "최민영 ");
//		System.out.println("내 나이는 " + result1);
//		System.out.println(result2);