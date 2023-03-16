package com.day_0316.chap13;

public class Hero extends Character {

	@Override
	public void attack(Monster monster) {
		System.out.println(this.name + "의 공격!");
		System.out.println("적에게 10포인트의 데미지를 주었다");
		monster.hp -= 3;
		System.out.println(monster.hp);

	}

}
