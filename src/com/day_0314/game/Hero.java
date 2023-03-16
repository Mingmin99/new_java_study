package com.day_0314.game;

public class Hero {
	// field.variable
	// global variable
	// member.variable

	String name;
	int hp;
	Sword sword;

	Hero() {
		this("김영웅"); //두번재 생성자 호출
	}

	Hero(String name) {
		this.name = name;
		this.hp = 100;
	}

}
