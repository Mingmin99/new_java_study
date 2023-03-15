package com.day_0314;

import java.util.HashMap;
import java.util.Map;

public class Example3 {

	public static void main(String[] args) {
//		Person person1 = new Person();
//		person1.name = "홍길동";
//		person1.age = 20;
//
//		Person person2 = new Person();
//		person2.name = "한석봉";
//		person2.age = 25;

//		Map<String, Integer> cities = new HashMap<>();

	   
		Map<String, Integer> person = new HashMap<>();
		
		person.put("홍길동", 20);
		person.put("한석봉", 25);
		
	for(String key : person.keySet()) {
		int value = person.get(key);
		System.out.println(key +  "의 나이는" + value + "살");
	}
		
	}

}
