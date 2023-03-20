 package com.day_0310.main;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int R = sc.nextInt();
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();
 
			if (Math.sqrt((x - a) * (x - a) + (y - b) * (y - b)) >= R) {
				System.out.println("silent");
			} else {
				System.out.println("noisy");
			}

		}

	}

}
