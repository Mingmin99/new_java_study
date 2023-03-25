package com.day_0317.quiet;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int radius = sc.nextInt();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int x_i = sc.nextInt();
			int y_i = sc.nextInt();

			ConstructionSite constructionSite = new ConstructionSite(a, b, radius);
			Tree treeLocation = new Tree(x_i, y_i);

			double distance = DistanceCalculator.distanceCalculator(x_i, y_i, a, b);
			Result.result(distance, radius);

		}

	}
}
