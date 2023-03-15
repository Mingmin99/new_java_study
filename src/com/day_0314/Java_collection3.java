package com.day_0314;

import java.util.HashMap;
import java.util.Map;

public class Java_collection3 {

	public static void main(String[] args) {
		Map<String, Integer> cities = new HashMap<>();
		cities.put("서울시", 977);
		cities.put("부산시", 856);
		cities.put("수원시", 152);
		
		int seoul = cities.get("서울시");
		System.out.println("서울시 인구는" + seoul + "만");
		cities.remove("서울시"); // 삭제
		cities.put("부산시",150); // 갱신
		System.out.println("부산시 인구는" + cities.get("부산시") + "만");
		
		for(String key: cities.keySet()) {
			int value = cities.get(key);
			System.out.println(key + "인구는" + value + "만");
		}
	}

}
