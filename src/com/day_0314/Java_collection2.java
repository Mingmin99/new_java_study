package com.day_0314;

import java.util.Set;
import java.util.HashSet;

public class Java_collection2 {
	public static void main(String[] args) {
	
	Set<String> colors = new HashSet<>();
	colors.add("red");
	colors.add("green");
	colors.add("blue");
	
	colors.add("red");
	System.out.println(colors.size());
		
	}
}
