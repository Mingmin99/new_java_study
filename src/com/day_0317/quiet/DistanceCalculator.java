package com.day_0317.quiet;

public class DistanceCalculator {

	public static double distanceCalculator(int treeX, int treeY, int conA, int conB) {
		return Math.pow((treeX - conA), 2) + Math.pow((treeY - conB), 2);

	}

}
