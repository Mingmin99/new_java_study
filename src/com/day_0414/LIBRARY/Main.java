package com.day_0414.LIBRARY;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Member m = new Member();
		Book b = new Book();
		Loan l = new Loan();
		System.out.println("1.회원관리  2.도서관리  3대출  4.종료");
		int input = sc.nextInt();
		if (input == 1) {
			System.out.println("0.뒤로  1.회원조회  2.회원등록  3.회원수정  4.회원삭제  5.삭제취소  ");

			switch (sc.nextInt()) {
			case 0:
				return;

//			case 1:
//				m.showFile();
//				break;
//			case 2:
//				m.createFile();
//				break;
//			case 3:
//				m.reviseFile();
//				break;
//			case 4:
//				m.deleteFile();
//				break;
//			case 5:
//				break;
			}

		} else if (input == 2) {
			System.out.println("0.뒤로  1.도서조회  2.도서등록  3.도서수정  4.도서삭제  5.삭제취소  ");
			switch (sc.nextInt()) {
			case 0:
				return;

			case 1:
				b.showFile();
				break;
			case 2:
				b.createFile();
				break;
			case 3:
				b.reviseFile();
				break;
			case 4:
				b.deleteFile();
				break;
			case 5:
				break;
			}
		} else if (input == 3) {
			System.out.println("0.뒤로  1.대출이력  2.대출가능 목록  3.대출하기  4.반납하기  5.연장하기 ");
			switch (sc.nextInt()) {
			case 0:
				return;

			case 1:

				break;
			case 2:

				break;
			case 3:
				l.borrowBook();

				break;
			case 4:

				break;
			case 5:
				break;
			}
		} else if (input == 4) {
			System.out.println("프로그램을 종료합니다");
		} else {
			System.out.println("잘못된 입력입니다");
		}

	}
}
