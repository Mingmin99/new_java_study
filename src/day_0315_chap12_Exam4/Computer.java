package day_0315_chap12_Exam4;

public class Computer extends TangibleAsset {

	private String makerName;

	public Computer(String name, String color, int price, double weight, String makerName) {
		super(name, color, price, weight);

		this.makerName = makerName;

	}

	public String getmaketName() {
		return makerName;
	}

}
