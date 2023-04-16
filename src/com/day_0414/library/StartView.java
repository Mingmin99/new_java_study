package com.day_0414.library;

import com.day_0414.library.book.controller.BookController;
import com.day_0414.library.loan.controller.LoanController;
import com.day_0414.library.member.controller.MemberController;
import com.day_0414.library.member.view.MemberView;

public class StartView {
	MemberView view;
	MemberController memberController;
	BookController bookController;
	LoanController loanController;

	public StartView() {
		view = new MemberView();
		memberController = new MemberController();
		bookController = new BookController();
		loanController = new LoanController();

	}

	public void main() {

		while (true) {
			int sel = view.showMenu();
			switch (sel) {
			case 0:
				return;
			case 1:
				memberController.main();
				break;
			case 2:
				bookController.main();
				break;
			case 3:
				int MEMBER_NO = 0;
				loanController.main(MEMBER_NO);
			}
			break;

		}

	}

}
