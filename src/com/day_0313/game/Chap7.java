package com.day_0313.game;

public class Chap7 {

	public static void main(String[] args) {

		// 용사여, 가상 세계에 탄생하라
		// 괴물 버섯이여, 가상 세계에 탄생하라
		// 용사여, 싸워라
		// 괴물 버섯이여, 도망가라

//		Hero hero1;
//		hero1 = new Hero();
//		hero1.hp = 100;
//		
//		Hero hero2;
//		hero2 = hero1;
//		hero2.hp = 200;
		
		Sword sword = new Sword();
		sword.name = "불의 검";
		sword.damage = 10;
		
//		Hero hero = new Hero();
//		hero.name = "김영웅";
//		hero.hp = 100;
//		hero.sword = sword;
//		
//		System.out.println("현재 무기는 " + hero.sword.name);
		
		

		// 생성된 용사에게 쵳ㅗ의 HP와 이름을 설정
//		hero.name = "준석";
//		hero.hp = 100;
//		System.out.println("용사" + hero.name + "를 생성했다");

		Kinoko kinoko1 = new Kinoko();
		kinoko1.hp = 50;
		kinoko1.suffix = 'A';
	

		Kinoko kinoko2 = new Kinoko();
		kinoko1.hp = 48;
		kinoko1.suffix = 'B';

		// 용사에게 5초 앉기, 넘어지기, 25초 앉기, 도망을 지시
//		hero.sit(5);
//		hero.sleep();
//		hero.sit(25);
//		hero.run();
	}

}
