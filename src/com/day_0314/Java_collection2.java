package com.day_0314;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Java_collection2 {
	public static void main(String[] args) {

		Set<String> colors = new HashSet<>();
		colors.add("red");
		colors.add("green");
		colors.add("blue");

		colors.add("red");
//	System.out.println(colors.size());

		Iterator<String> iter = colors.iterator();
		while (iter.hasNext()) {
			String color = iter.next();
			System.out.println(color);
		}

	}
}
