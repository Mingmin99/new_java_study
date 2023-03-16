package day_0315_chap12_Exam4;

public class Book extends TangibleAsset {

	private String isbn;

	public Book(String name, String color, int price, double weight, String isbn) {
		super(name, color, price, weight);
		this.isbn = isbn;

	}

	public String getIsbn() {
		return isbn;
	}

}
