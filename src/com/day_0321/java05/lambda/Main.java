package com.day_0321.java05.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntToDoubleFunction;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		for (Integer i : list) {
			System.out.println(i);
		}

		list.stream().forEach(i -> System.out.println(i));
		list.stream().forEach(System.out::println);

	}

}

//		IntToDoubleFunction func = a -> a * 3.14;
//		double result = func.applyAsDouble(5);
//		System.out.println("5 * 3.14= " + result);
