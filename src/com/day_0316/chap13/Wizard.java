package com.day_0316.chap13;

public class Wizard extends Character {
	int mp;

//	@Override
//	public void attack(Kinoko kinoko) {
//		System.out.println(this.name + "의 공격!");
//		System.out.println("적에게 3포인트의 데미지");
//		kinoko.hp -= 3;
//		System.out.println(kinoko.hp);
//
//	}

	public void fireball(Kinoko kinoko) {
		System.out.println(this.name + "는 불의 구슬을 맞았다");
		System.out.println(kinoko.name + "에게 20포인트의 데미지");
		kinoko.hp -= 20;
		this.mp -= 5;
	}

}
