package com.day_0314;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "홍길동";

		Person person2 = new Person();
		person2.name = "한석봉";

		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(person1);
		personList.add(person2);

		for (int i = 0; i < personList.size(); i++) {
			System.out.println(personList.get(i).name);

		}
	}

}
