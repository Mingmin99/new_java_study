package com.day_0320.chap15;

public class Person {
	int age;

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("나이는 음수가 될 수 없음. 지정한 값은 " + age);
		} else {
			this.age = age;
		}
	}
}