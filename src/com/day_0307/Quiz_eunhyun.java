package com.day_0307;

import java.util.Scanner;

public class Quiz_eunhyun {
	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
		if (n == 0)
			return;
		String result = "";
	
		for (int i = 0; i < n; i++) {
			String word = sc.next();
			if (n == 1 || i == 0) {
				result = word;
			} else {
				result += ", " + word;
			}
		}
		System.out.println("Hello " + result + ".");
	}
}
