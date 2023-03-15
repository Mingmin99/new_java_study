package com.day_0314;

import java.util.ArrayList;
import java.util.Iterator;

public class Java_collection {

	public static void main(String[] args) {
		//ArrayList 확보
		ArrayList<String> names = new ArrayList<String>();

		names.add("강은현");
		names.add("최민영");
		names.add("최유림");

		Iterator<String> it = names.iterator();

		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}

	}

}
