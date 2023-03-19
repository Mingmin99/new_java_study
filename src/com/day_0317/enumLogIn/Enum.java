package com.day_0317.enumLogIn;

public class Enum {

	enum Fruit {
		Apple("red"), Peach("pink"), Banana("yellow");

		private String color;
		public String getColor() {
			return this.color;
		}

		Fruit(String color) {
			System.out.println("call constructor " + this);
			this.color = color;
		}
	}

	enum Compnany {
		Google, Apple, Oracle;
	}

	public static void main(String[] args) {

		for (Fruit f : Fruit.values()) {
			System.out.println(f + ", " + f.getColor());
		}

		Fruit type = Fruit.Apple;

		switch (type) {
		case Apple:
			System.out.println(27 + "kcal 색깔은 " + Fruit.Apple.getColor());
			break;
		case Peach:
			System.out.println(34 + "kcal" + Fruit.Peach.getColor());
			break;
		case Banana:
			System.out.println(93 + "kcal" + Fruit.Banana.getColor());
			break;

		}

	}

}
