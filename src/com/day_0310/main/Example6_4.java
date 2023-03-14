package com.day_0310.main;

import java.util.Random;
import java.util.Scanner;

public class Example6_4 {

	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		System.out.println("던질 횟수를 입력해주세요");
		long tries = sc.nextLong();
		int hits = 0;
		for (int i = 0; i < tries; i++) {
			Random random = new Random();
			double x = random.nextDouble() * 2 - 1;
			double y = random.nextDouble() * 2 - 1;
			if (Math.sqrt((x) * (x) + (y) * (y)) <= 1) {
				hits++;
			}

		}
		double piEstimate = (4 * (double) hits / tries);
		System.out.println("piEstimate 값은 " + piEstimate);
	}

}
