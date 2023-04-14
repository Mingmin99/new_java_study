package com.day_0414.LIBRARY;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Book implements Crud {
	Scanner sc = new Scanner(System.in);
	private String title;
	private String bookNum;
	private String author;
	private String bookDate;

	public Book() {
	}

	public Book(String title, String bookNum, String author, String bookDate) {
		this.title = title;
		this.bookNum = bookNum;
		this.author = author;
		this.bookDate = bookDate;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBookNum() {
		return bookNum;
	}

	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookDate() {
		return bookDate;
	}

	public void setBookDate(String bookDate) {
		this.bookDate = bookDate;
	}

	public String toString() {
		return title + "," + bookNum + "," + author + "," + bookDate;
	}

	@Override
	public void createFile() {
		String fileName = "book.txt";
		File file = new File(fileName);
		FileWriter fileWriter;

		try {
			fileWriter = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			System.out.println("제목을 입력하시오");
			String title = sc.nextLine();
			System.out.println("북넘버를 입력하시오");
			String bookNumber = sc.nextLine();
			System.out.println("저자를 입력하시오");
			String author = sc.nextLine();
			System.out.println("출간일을 입력하시오\n(ex 2023/01/01 형식으로 입력하시오)");
			String bookDate = sc.nextLine();
			Book book = new Book(title, bookNumber, author, bookDate);

			// 파일에 멤버 정보 쓰기
			bufferedWriter.write(book.toString());
			bufferedWriter.newLine();
			bufferedWriter.flush();

			// BufferWriter 객체와 FileWriter 객체 닫기
			bufferedWriter.close();
			fileWriter.close();

			System.out.println("책 정보가 파일에 저장되었습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

	@Override
	public void showFile() {
		FileReader fr;
		try {
			fr = new FileReader("book.txt");
			BufferedReader br = new BufferedReader(fr);

			String line;

			while ((line = br.readLine()) != null) {
				String[] lines = line.split(",");
				System.out.println(line);
			}
			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	@Override
	public void reviseFile() {
		FileReader fr;
		try {
			fr = new FileReader("book.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("temp.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);

			System.out.println("수정할 책의 이름을 입력하세요");
			String titleToRevise = sc.nextLine();

			String line;
			boolean found = false;

			while ((line = br.readLine()) != null) {
				String[] lines = line.split(",");
				String title = lines[0];

				if (titleToRevise.equals(title)) {
					System.out.println("수정할 책 넘버를 입력하세요");
					String bookNumber = sc.next();
					System.out.println("수정할 책 저자를 입력하세요");
					String author = sc.next();
					System.out.println("수정할 책 출간일을 입력하세요");
					String bookDate = sc.next();

					bw.write(title + "," + bookNumber + "," + author + "," + bookDate);
					bw.newLine();
					found = true;
					break;
				} else {
					bw.write(line);
					bw.newLine();
				}
			}
			if (found) {
				System.out.println("책 정보가 수정되었습니다");
			} else {
				System.out.println("책 정보를 찾을 수 없습니다");
			}

			bw.flush();
			br.close();
			fr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File bookFile = new File("book.txt");
		File tempFile = new File("temp.txt");
		if (bookFile.delete()) {
			tempFile.renameTo(bookFile);
		}

	}

	@Override
	public void deleteFile() {
		FileReader fr;
		try {
			fr = new FileReader("book.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("temp.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);

			System.out.println("삭제할 책의 이름을 입력하세요");
			String titleToDelete = sc.nextLine();

			String line;
			boolean found = false;

			while ((line = br.readLine()) != null) {
				String[] lines = line.split(",");
				String title = lines[0];

				if (titleToDelete.equals(title)) {

					found = true;
					continue;

				} else {
					bw.write(line);
					bw.newLine();
				}
			}
			if (found) {
				System.out.println("책정보가 삭제되었습니다");
			} else {
				System.out.println("해당 책을 찾을 수 없습니다");
			}

			br.close();
			fr.close();
			bw.close();
			fw.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File bookFile = new File("book.txt");
		File tempFile = new File("temp.txt");
		if (bookFile.delete()) {
			tempFile.renameTo(bookFile);
		}

	}

	public boolean isBorrowed() {
		// TODO Auto-generated method stub
		return false;
	}

}
