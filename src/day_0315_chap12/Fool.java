package day_0315_chap12;

public class Fool extends Character implements Human {

	public Fool(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(Kinoko kinokok) {
		System.out.println(getName() + "는 싸우지 않고 놀고있");

	}

	@Override
	public void talk() {
	}

	public void hear() {
	}

	public void watch() {
	}

}
