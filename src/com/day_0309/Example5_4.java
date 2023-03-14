package com.day_0309;

public class Example5_4 {
	static final double PIE = 3.14;

	public static void main(String[] args) {

		double bottom = 14;
		double height = 20;
		double triangle = calcTriangleArea(bottom, height);
		System.out.println("삼각형의 넓이는" + triangle + "cm²");

		double radius = 4;
		double circle = calcCircleArea(radius);
		System.out.println("원의 면적은" + circle + "cm²");
	}

	public static double calcTriangleArea(double b, double h) {
		double triangle = (b * h) / 2;
		return triangle;
	}

	public static double calcCircleArea(double r) {
//		System.out.println(Math.pow(r,2) * 3.14);

		double circle = Math.pow(r, 2) * PIE;
		return circle;

	}
}
