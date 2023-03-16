package com.day_0315.chap11;

public class Main {

	public static void main(String[] args) {
		//Hero hero = new Hero();
		//hero.run();
		
		SuperHero superHero = new SuperHero();
		Kinoko kinoko = new Kinoko('A');
		superHero.attack(kinoko);

	}

}
