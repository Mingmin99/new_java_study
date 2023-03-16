package day_0315_chap12_Exam1;

public class Book extends TangibleAsset {

	private String isbn;

	public Book(String name, String color, int price, String isbn) {
		super(name, color, price);
		this.isbn = isbn;

	}

	public String getName() {
		return getName();
	}

	public String getColor() {
		return getColor();
	}

	public String getIsbn() {
		return isbn;
	}

	public int getPrice() {
		return getPrice();
	}

}
