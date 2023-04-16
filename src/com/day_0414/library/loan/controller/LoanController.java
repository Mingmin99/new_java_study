package com.day_0414.library.loan.controller;

import java.util.ArrayList;

import com.day_0414.library.book.model.Book;
import com.day_0414.library.book.model.BookDao;
import com.day_0414.library.loan.model.Loan;
import com.day_0414.library.loan.model.dao.LoanDao;
import com.day_0414.library.loan.view.LoanView;

public class LoanController {
	LoanView view;
	LoanDao dao;

	public LoanController() {
		super();
		view = new LoanView();
		dao = new LoanDao();
	}

	public void main(int MEMBER_NO) {
		while (true) {
			int sel = view.showLoanMenu();
			switch (sel) {
			case 0:
				// 뒤로가기
				return;
			// 대출이력 = loan
			case 1:
				loanAndReturnInfo(MEMBER_NO);
				break;
			// 대출 및 반납
			case 2:
				loanBook(MEMBER_NO);
				break;
			// 대출하기
			case 3:
				extendLoan(MEMBER_NO);
				break;
			// 연장하기
			}
		}
	}

	private void extendLoan(int MEMBER_NO) {
		ArrayList<Loan> list = dao.selectAllLoanBook(MEMBER_NO);
		int extendSel = view.extendLoan(list);
		if (dao.extendLoan(extendSel) > 0) {
			System.out.println("연장이 완료되었습니다.");
		} else {
			System.out.println("연장에 실패했습니다.");
		}

	}

	private void loanBook(int BOOK_NO) {
		// 빌릴 수 있는 책 조회
		// 대출여부가 no이어야함
		BookDao bookDao = new BookDao();
		ArrayList<Book> book1 = dao.availableBookInfo();

		// ArrayList<Book> book = dao.getBookInfo();
		int BOOK_NO1 = view.loanBook(book1);
		for (int i = 0; i < book1.size(); i++) {
			if (book1.get(i).getBOOK_NO() == (BOOK_NO1)) {

				System.out.println("대출실행이 완료되었습니다.");

			} else {
				System.out.println("대출을 실패했습니다.");
			}
			break;

		}
		book1.clear();
	}

	private void loanAndReturnInfo(int MEMBER_NO) {
		// 대출할 수 있는 정보
		ArrayList<Book> list = dao.getBookInfo(MEMBER_NO);
		if (list.size() == 0) {
			System.out.println("대출내역이 존재하지 않습니다.");
			// 대출이 하나도 없는 경우
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getBOOK_NO() + " " + list.get(i).getTITLE() + " "
						+ list.get(i).getAUTHOR() + " " + list.get(i).getPUBLISHER() + " "
						+ list.get(i).getPUBLISH_DATE() + " " + list.get(i).getAVAILABLE_STATUS());
			}
		}
		list.clear();
		int BOOK_NO = view.updateReturn();
		if (BOOK_NO > 0) {
			System.out.println("반납이 완료되었습니다.");
		} else {
			System.out.println("반납에 실패했습니다.");
		}

	}
}
