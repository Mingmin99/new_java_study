package com.day_0308;

public class Example4_3 {

	public static void main(String[] args) {
		int[] counts = null;
		float[] heights = { 171.3F, 175.0F };
		System.out.println(counts[1]);  // 예외발생 -> NullPointerException 예외
		System.out.println(heights[2]); // 예외발생 -> ArrayIndexOutOfBoundsException 예외

	}

}
