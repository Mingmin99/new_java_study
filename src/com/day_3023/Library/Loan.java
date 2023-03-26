package com.day_3023.Library;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Loan {
	Scanner scanner = new Scanner(System.in);
	private boolean isBorrowed; // 대출 여부
	private Date borrowedDate; // 대출일
	private Date dueDate; // 반납예정일

//	 대출 이력을 저장할 리스트
//	private List<Book> loanList;
//
//	public Loan() {
//		this.loanList = new ArrayList<>();
//	}

	// 대출 메서드
	public void borrowBook() {

		// 멤버와 책 정보 입력 받기
		System.out.print("멤버 이름 입력: ");
		String memberName = scanner.next();

		File file = new File("member.txt"); // 파일 경로에 맞게 수정
		try {
			Scanner fileScanner = new Scanner(file);

			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				if (line.contains(memberName)) {
					System.out.println("찾은 멤버 정보: " + line);
					break;
				}
			}

			fileScanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
		System.out.print("책 제목 입력: ");
		String bookTitle = scanner.next();

		File file2 = new File("book.txt"); // 파일 경로에 맞게 수정
		try {
			Scanner fileScanner = new Scanner(file);

			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				if (line.contains(bookTitle)) {
					System.out.println("찾은  정보: " + line);
					break;
				}
			}

			fileScanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
	}

	// 멤버와 책 생성
//        Member member = new Member(memberName);
//        Book book = new Book(bookTitle);

	// borrowBook() 메소드 호출
//		borrowBook(member, book);

//		if (Book.isBorrowed()) {
//			System.out.println("이미 대출 중인 도서입니다.");
//			return;
//		} else {
//			isBorrowed = true;
//			borrowedDate = new Date(); // 대출일은 현재 날짜로 설정
//			System.out.println("대출날짜: " + borrowedDate);
//			Date dueData = null;
//			Calendar calendar = Calendar.getInstance();
//			calendar.setTime(borrowedDate);
//			calendar.add(Calendar.DATE, 14); // 대출 기간은 14일로 고정
//			dueDate = (Date) calendar.getTime();
//			System.out.println("도서가 대출되었습니다. 반납 예정일은 " + dueDate + "입니다.");
//
//		}
//
//	}

	// 연장 메서드
	public void extendBorrow() {
		if (!isBorrowed) {
			Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.DATE, 7);
			dueDate = (Date) calendar.getTime();
			System.out.println("연장 후 반납 예정일은 " + dueDate + "입니다.");
		}

	}

	// 반납 메서드
	public void returnBook() {
		if (!isBorrowed) {
			System.out.println("대출 중인 도서가 아닙니다.");
			return;
		}

		isBorrowed = false;
		borrowedDate = null;
		dueDate = null;
		System.out.println("도서가 반납되었습니다.");
	}

}
