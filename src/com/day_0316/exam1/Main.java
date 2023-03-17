package com.day_0316.exam1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

//		X obj = new A();
//		obj.a();
//		Y y1 = new A();
//		Y y2 = new B();
//		y1.a();
//		y2.a();

		ArrayList<Y> list = new ArrayList<>();

		list.add(new A());
		list.add(new B());
		for (int i = 0; i < list.size(); i++) {

			list.get(i).b();
		}
	}

}
