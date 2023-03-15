package com.day_0314_game;

public class Main {

	public static void main(String[] args) {

//		Hero hero = new Hero();
//		System.out.println(hero.hp);
		
//		String str = new String ("안녕하세요");
//		String str = "안녕하세요";
//		System.out.println(str);
//
		Hero hero1 = new Hero("스랄");
		hero1.hp = 100;
		System.out.println(hero1.hp);
		System.out.println(hero1.name);
		
		Hero hero = new Hero();
		System.out.println(hero.name);
		
		
//
//		Hero hero2 = new Hero();
//		hero1.name = "아서스";
//
//		Wizard wizard = new Wizard();
//		wizard.name = "제이나";
//		wizard.hp = 50;
//
//		wizard.heal(hero1);
//		wizard.heal(hero2);
//		wizard.heal(hero2);

//		Sword sword = new Sword() ;
//		sword.name = "불의 검";
//		sword.damage = 10;
//		
//		Hero hero = new Hero() ;
//		hero.name = "김영웅";
//		hero.hp = 100;
//		hero.sword = sword;
//		
//		System.out.println("현재 무기는" + hero.sword.name);
	}

}
