package com.day_0310.main;

public class Example6_3 {

	public static void main(String[] args) {
		for (int i = 0; i < 60; i++) {
			for (int j = 1; j <= 12; j++) {
				System.out.printf("%s", String.format("%d:%02d\t", j, i));
			}
			System.out.println();

		}

	}

}
