package com.day_0308;

import java.util.Scanner;

public class Quiz_4 {

	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
		if (n == 0)
			return;

		String[] word = new String[n];
		String[] result = new String[n];

		for (int i = 0; i < n; i++) {
			word[i] = sc.next();
			if (i == n - 1) {
				result[i] = word[i] + ".";
			} else
				result[i] = word[i] + ",";
		}
		System.out.print("Hello ");
		System.out.print(result[0] + result[1]);

		for (String r : result) {
			System.out.print(r + " ");
		}

	}
}
