package com.day_0321.java05.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		for (int i = 0; i < nums.size(); i++) {
			if (i % 2 == 0) {
				System.out.println(nums.get(i) + 1);
			}
		}
		System.out.println("---");

//			nums.stream()
//			filter((num) -> num %2 == 0)
//			map((num) ->num + "번")
//			forEach((num) -> System.out.pritntln(num + 1));
	}

}
