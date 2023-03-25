package com.day_0317.quiet;

public class Result {
	public static void result(double distance, int getRadius) {
		if (distance >= (getRadius * getRadius)) {
			System.out.println("silent");
		} else {
			System.out.println("noisy");
		}
	}

}
