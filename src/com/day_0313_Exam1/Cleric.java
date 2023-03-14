package com.day_0313_Exam1;

import java.util.Random;

public class Cleric {

	String name;
	final int MAXHP = 50;
	int hP = MAXHP;
	final int MAXMP = 10;
	int mp = MAXMP;

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
