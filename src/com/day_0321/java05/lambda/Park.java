package com.day_0321.java05.lambda;

import java.util.ArrayList;
import java.util.List;

public class Park {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("박경덕");
		names.add("이동학");
		names.add("박준하");
		names.add("박태현");

		List<String> parks = getparkList(names);
		System.out.println(parks);

	}

	public static List<String> getparkList(List<String> names) {
		List<String> result = new ArrayList<>();

		for (String name : names) {
			if (name.startsWith("박")) {
				result.add(name);
			}
		}
		return result;
	}

}
