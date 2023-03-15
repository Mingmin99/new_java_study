package com.day_0314_game;

public class Wizard {
	String name;
	int hp;

	void heal(Hero hero) {
		hero.hp += 10;
		System.out.println(hero.name + "의 hp를 10회복했다!");
	}
}
