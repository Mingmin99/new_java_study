package com.day_0316.instance.hashSet;

import java.util.HashSet;

import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Hero> heroSet = new HashSet<>();

		Hero hero = new Hero();
		hero.name = "최민영";
		heroSet.add(hero);
		System.out.println(heroSet.size());

		hero = new Hero();
		hero.name = "바보 ";
		heroSet.remove(hero);
		System.out.println(heroSet.size());

	}

}
