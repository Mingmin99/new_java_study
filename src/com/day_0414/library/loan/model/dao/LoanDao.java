package com.day_0414.library.loan.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.day_0414.library.book.model.Book;
import com.day_0414.library.loan.model.Loan;

public class LoanDao {

	Connection conn = null; // DBMS 연결용 객체
	Statement st = null; // SQL구문을 실행하고 결과를 받아오는 객체
	ResultSet rs = null; // SELECT실행 결과를 저장하는 객체
	ArrayList<Loan> list = new ArrayList<Loan>(); // 전체 도서정보를 저장할 객체
	ArrayList<Book> list2 = new ArrayList<Book>(); // 전체 도서정보를 저장할 객체

	public LoanDao() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 3. 쿼리문을 실행할 statement객체 생성
		// --여기다 sql파일을 열어서 ddl파일 열기

		try {
			st = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 내 대출 이력
	public ArrayList<Loan> selectAllLoanBook(int MEMBER_NO) {
		String query = "select * from LOAN where MEMBER_NO ='" + MEMBER_NO + "'";
		try {
			rs = st.executeQuery(query);
			while (rs.next()) {
				Loan loan = new Loan();
				loan.setLOAN_NO(rs.getInt("LOAN_NO"));
				loan.setLOAN_DATE(rs.getString("LOAN_DATE"));
				loan.setRETURN_DATE(rs.getString("RETURN_DATE"));
				loan.setRETURN_STATUS(rs.getInt("RETURN_STATUS"));
				loan.setEXTENDIBLE(rs.getInt("EXTENDIBLE"));
				loan.setEXTENDED_DATE(rs.getString("EXTENDED_DATE"));
				loan.setMEMBER_NO(rs.getInt("MEMBER_NO"));
				loan.setBOOK_NO(rs.getInt("BOOK_NO"));
				loan.setAVAILABLE_STATUS(rs.getInt("AVAILABLE_STATUS"));

				list.add(loan);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	// 대출하기
	public int loanBook(int MEMBER_NO, int BOOK_NO) {
		int result = 0;
		String query = "insert into LOAN(LOAN_NO,MEMBER_NO,BOOK_NO) values(LOAN_NO,'" + MEMBER_NO + "','" + BOOK_NO
				+ "')";
		try {
			st = conn.createStatement();
			result = st.executeUpdate(query);
			conn.setAutoCommit(false);
			if (result > 0) {
				conn.commit();
			} else {
				conn.rollback();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	// 미반납인 도서 정보를 가져온다. => 내가 현재 대출한 책 정보들을 가지고 오는 것

	public ArrayList<Book> getBookInfo(int MEMBER_NO) {
		String query = "SELECT BOOK_NO, TITLE, AVAILABLE_STATUS " + "FROM BOOK " + "WHERE BOOK_NO = (SELECT BOOK_NO "
				+ "FROM LOAN " + "WHERE LOAN.MEMBER_NO = " + MEMBER_NO + "  AND LOAN.RETURN_STATUS = 0)";
		try {
			rs = st.executeQuery(query);
			while (rs.next()) {
				Book book = new Book();
				Loan loan = new Loan();
				book.setBOOK_NO(rs.getInt("BOOK_NO"));
				book.setTITLE(rs.getString("TITLE"));
				book.setAVAILABLE_STATUS(rs.getInt("AVAILABLE_STATUS"));
				loan.setMEMBER_NO(rs.getInt("MEMBER_NO"));
				loan.setRETURN_STATUS(rs.getInt("RETURN_STATUS"));
				list2.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list2;
	}

	// 연장하기
	public int extendLoan(int extendSel) {
		int result = 0;
		try {
			String query = "update loan_info set extendible=0, end_date = end_date+7 where loan_no=" + extendSel;
			// ;포함x
			st = conn.createStatement();
			result = st.executeUpdate(query);
			conn.setAutoCommit(false); // 자동 커밋 해제
			if (result > 0) {
				// 성공한 경우(적용된 행의 갯수가 0개보다 크면)
				conn.commit();
			} else {
				// 실패한 경우(작용된 행의 갯수가 0이면)
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	// 반납하기
	public int ReturnBook(int MEMBER_NO, int BOOK_NO) {
		int result = 0;
		String query = "UPDATE LOAN SET RETURN_STATUS = 1 WHERE MEMBER_NO = " + MEMBER_NO + " AND BOOK_NO = " + BOOK_NO
				+ " AND RETURN_STATUS = 0;";

		try {
			st = conn.createStatement();
			result = st.executeUpdate(query);
			conn.setAutoCommit(false);
			if (result > 0) {
				conn.commit();
			} else {
				conn.rollback();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public ArrayList<Book> availableBookInfo() {
		String query = "select * from BOOK where AVAILABLE_STATUS = 1 ";
		try {
			rs = st.executeQuery(query);
			while (rs.next()) {
				Book book = new Book();
				book.setBOOK_NO(rs.getInt("BOOK_NO"));
				book.setTITLE(rs.getString("TITLE"));
				book.setAUTHOR(rs.getString("Author"));
				book.setPUBLISHER(rs.getString("PUBLISHER"));
				book.setPUBLISH_DATE(rs.getString("PUBLISH_DATE"));
				book.setAVAILABLE_STATUS(rs.getInt("AVAILABLE_STATUS"));
				list2.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list2;
	}

}

