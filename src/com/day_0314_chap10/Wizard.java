package com.day_0314_chap10;

public class Wizard {

	private String name;
	private double power;

	public double getPower() {
		return power;
	}

	public void setPower() {
		if (power == Double.parseDouble(null)) {
			throw new IllegalArgumentException("마법사 지팡이는 null 일 수 없다");
		}
		if (power < 0.5) {
			throw new IllegalArgumentException("지팡이 마력은 0.5 이상이어야 함");
		}
		if (power > 100.0) {
			throw new IllegalArgumentException("지팡이 마력은 100.0 이하이어야 함");
		}
		this.power = power;
	}

	public String getName() {
		return name;

	}

	public void setName() {
		if (name == null) {
			throw new IllegalArgumentException("이름은 null 이 아니어야 함");
		}
		if (name.length() <= 3) {
			throw new IllegalArgumentException("이름은 반드시 3문자 이상");
		}
		this.name = name;
	}

	private Wand wand;

	public Wand getWand() {
		return wand;
	}

	public void setWand() {
		this.wand = wand;
	}

	public void heal(Hero hero) {
		int basePoint = 10;
		int recovPoint = (int) (basePoint * this.wand.getPower());
		hero.setHp(hero.getHp() + recovPoint);
	}
}
