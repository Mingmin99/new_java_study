package com.day_0313.Exam1;

import java.util.Random;

public class Cleric {

	String name;
	int hP = MAXHP;
	int mp = MAXMP;

	final static int MAXHP = 50;
	final static int MAXMP = 10;

	Cleric(String name, int hp, int mp) {
		this.name = "아서스";
		this.hP = 40;
		this.mp = 5;
	}

	Cleric(String name, int hp) {
		this.name = "아서스";
		this.hP = 35;
		this.mp = MAXMP;
	}

	Cleric(String name) {
		this.name = "아서스";
		this.hP = MAXHP;
		this.mp = MAXMP;
	}

	void selfAid() {
		this.mp -= 5;
		this.hP = MAXHP;
		System.out.println("성직자는 mp 5를 소비하였고,최대 HP 까지 회복!");
	}

	int pray(int sec) {
		int initMP = mp;
		int point = new Random().nextInt(3) + sec;
		mp += point;

		if (mp > MAXMP) {
			mp = MAXMP;
			point = MAXMP - initMP;
		}
		return point;
	}

}
