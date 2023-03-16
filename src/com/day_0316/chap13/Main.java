package com.day_0316.chap13;

public class Main {

	public static void main(String[] args) {

//  타입 Monster 로 퉁치기

		Monster[] monsters = new Monster[2];
		monsters[0] = new Slime();
		monsters[1] = new Goblin();
		
//동작은 안에 담긴 객체를 따름
		for (Monster monster : monsters) {
			monster.run();
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
