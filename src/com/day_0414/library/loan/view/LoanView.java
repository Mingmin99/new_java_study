package com.day_0414.library.loan.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.day_0414.library.book.model.Book;
import com.day_0414.library.loan.model.Loan;
import com.day_0414.library.member.model.Member;

public class LoanView {
	Scanner sc = new Scanner(System.in);

	public LoanView() {

	}

	public int showLoanMenu() {

		System.out.println("-------대출 관리 프로그램 -------");
		System.out.println("0.뒤로  1.대출이력  2.대출하기  3.연장하기 ");
		System.out.println("선택 > ");
		int sel = sc.nextInt();
		return sel;
	}

	public int loanBook(ArrayList<Book> book) {
		if (book.size() == 0) {
			System.out.println("대출가능한 도서가 없습니다.");
		} else {
			for (int i = 0; i < book.size(); i++) {
				System.out.println(book.get(i).getBOOK_NO() + " " + book.get(i).getTITLE() + " " + " "
						+ book.get(i).getAUTHOR() + " " + book.get(i).getPUBLISHER() + " "
						+ book.get(i).getPUBLISH_DATE() + book.get(i).getAVAILABLE_STATUS());
			}
		}
		System.out.print("대출 할 도서번호 입력하세요 > ");
		int BOOK_NO = sc.nextInt();
		return BOOK_NO;
	}

	public int extendLoan(ArrayList<Loan> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(
					list.get(i).getLOAN_NO() + " " + list.get(i).getLOAN_DATE() + " " + list.get(i).getRETURN_DATE()
							+ " " + list.get(i).getRETURN_STATUS() + " " + list.get(i).getEXTENDIBLE() + " "
							+ list.get(i).getEXTENDED_DATE() + " " + list.get(i).getMEMBER_NO() + " "
							+ list.get(i).getBOOK_NO() + " " + list.get(i).getAVAILABLE_STATUS());
		}
		// 연장시 연장할 대출번호를 입력
		System.out.print("연장할 대출번호를 입력하세요 > ");
		int sel = sc.nextInt();
		return sel;
		// extendible 를 0으로 업데이트 후에 end_date를 7늘린다.
	}
	// 반납하기

	public int updateReturn() {
		System.out.print("반납할 번호 입력하세요 > ");
		int BOOK_NO = sc.nextInt();
		return BOOK_NO;
	}

}
