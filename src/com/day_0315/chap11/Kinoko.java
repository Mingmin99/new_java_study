package com.day_0315.chap11;

import com.day_0315.chap11.Hero;

public class Kinoko {
	String name = "최유림";
	int hp = 50;
	private char suffix;
	
	

	public Kinoko(char suffix) {
		this.suffix = suffix;
	}
	public void attack(Hero hero) {
		System.out.println("키노코" + this.suffix + "의 공격");
		System.out.println("10의 데미지");
		hero.setHp(hero.getHp() - 10);
	}
	

}
