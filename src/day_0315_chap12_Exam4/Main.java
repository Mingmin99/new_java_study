package day_0315_chap12_Exam4;

public class Main {

	public static void main(String[] args) {
		Book book = new Book("자바의 정석", "white", 30000, 1.0, "b1234");
		Computer computer = new Computer("mac", "silver", 2500000, 3.0, "A2337");
		book.setWeight(3.5);
		computer.setWeight(10.5);
		System.out.println("책은" + book.getName() + "," + book.getColor() + "," + book.getPrice() + ","
				+ book.getWeight() + "," + book.getIsbn() + "이다 ");
		System.out.println("노트북은" + computer.getName() + "," + computer.getColor() + "," + book.getPrice() + ","
				+ computer.getWeight() + "," + computer.getmaketName() + "이다 ");

	}

}
