package com.day_0316.chap13;

public class Main {

	public static void main(String[] args) {

		Character[] characters = new Character[5];
		characters[0] = new Hero();
		characters[1] = new Hero();
		characters[2] = new Thief();
		characters[3] = new Wizard();
		characters[4] = new Wizard();

		for (Character character : characters) {
			character.setHp(character.getHp() + 50);
		}

//		Character character = new Wizard();
//Slime slime = new Slime();
//		Monster monster = new Slime();
//		slime.run();
//		monster.run();

//		if (character instanceof Wizard) {
//			Wizard wizard = (Wizard) character;
//			System.out.println("형 변환 가능");
//		} else {
//			System.out.println("형변환 불가");
//		}

//		Wizard w = new Wizard();
//		w.name = "민영";
//		Character c = w;
//		c.name = "바보";
//		Kinoko k = new Kinoko();
//		c.attack(k);
//		c.fireball(k);
	}
}
