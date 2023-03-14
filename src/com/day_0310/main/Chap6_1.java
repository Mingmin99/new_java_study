package com.day_0310.main;

import java.util.Random;
import java.util.Scanner;

import com.day_0310.logics.CalcLogic;

public class Chap6_1 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		int total = CalcLogic.add(a, b);
		int detail = CalcLogic.minus(a, b);
		System.out.println("더하면" + total + "빼면" + detail);

	}

	private static int add(int a, int b) {
		return a + b;
	}

	private static int minus(int a, int b) {
		return a - b;
	}
}
