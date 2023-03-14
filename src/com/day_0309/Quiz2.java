package com.day_0309;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.nextLine();
		int[] array = sequ(m, n);
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.println(array[i]);
			} else {
				System.out.print(array[i] + " ");
			}

		}

	}

	public static int[] sequ(int m, int n) {
		int[] ans = new int[10];
		for (int i = 0; i < 10; i++) {
			ans[i] = m + i * n;
		}
		return ans;

	}
}
