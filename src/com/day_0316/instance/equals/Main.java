package com.day_0316.instance.equals;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Hero> list = new ArrayList<>();

		Hero hero = new Hero();
		hero.name = "최민영";
		list.add(hero);
		System.out.println(list.size());

		hero = new Hero();
		hero.name = "바보 ";
		list.remove(hero);
		System.out.println(list.size());

	}

}
