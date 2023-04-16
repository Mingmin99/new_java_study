package com.day_0414.library.member.model.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.day_0414.library.member.model.Member;

//DB관련 코드
//DB에 접근하는 요청이 있다면 여기에서 처리
public class MemberDao {
	Connection conn = null; // DBMS 연결용 객체
	Statement st = null; // SQL구문을 실행하고 결과를 받아오는 객체
	ResultSet rs = null; // SELECT실행 결과를 저장하는 객체
	ArrayList<Member> list = new ArrayList<Member>(); // 전체 회원정보를 저장할 객체

	public MemberDao() {
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

	public ArrayList<Member> seletAllMember() {
		String query = "select * from MEMBER"; // 쿼리문 작성시 ;포함x
		try {
			// 4. 쿼리문전송
			// SELET를 수행하기 떄문에 executeQuery()메소드를 호출
			rs = st.executeQuery(query);

			// 5. 쿼리문 수행결과 저장
			// SELECT 수행결과는ResultSet 객체로 리턴

			// 4. 쿼리 결과를 처리
			while (rs.next()) {
				Member member = new Member();

				member.setMEMBER_NO(rs.getInt("MEMBER_NO"));
				member.setNAME(rs.getString("NAME"));
				member.setADDRESS(rs.getString("ADDRESS"));
				member.setPHONE_NUMBER(rs.getString("PHONE_NUMBER"));
				member.setBIRTH(rs.getString("BIRTH"));
				member.setJOIN_DATE(rs.getString("JOIN_DATE"));
				list.add(member);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public Member selectOneMember(int MEMBER_NO) {
		Member member = new Member();
		String query = "select * from customer where MEMBER_NO ="+MEMBER_NO;
		try {
			rs = st.executeQuery(query);
			while (rs.next()) {
				member.setMEMBER_NO(rs.getInt("MEMBER_NO"));
				member.setNAME(rs.getString("NAME"));
				member.setADDRESS(rs.getString("ADDRESS"));
				member.setPHONE_NUMBER(rs.getString("PHONE_NUMBER"));
				member.setBIRTH(rs.getString("BIRTH"));
				member.setJOIN_DATE(rs.getString("setJOIN_DATE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return member;
	}

	public int registerMember(Member member) {
		int result = 0;
		try {
			String query = "insert into Member values('" + member.getMEMBER_NO() + "','" + member.getNAME() + "','"
	                + member.getADDRESS() + "','" + member.getPHONE_NUMBER() + "','" + member.getBIRTH() + "','"
	                + member.getJOIN_DATE() + "')"; // 쿼리문
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

	public int updateMember(Member member, int MEMBER_NO) {
		int result = 0;
		try {
			String query = "update MEMBER set NAME='" + member.getNAME() + "',ADDRESS='" + member.getADDRESS()
					+ "',PHONE_NUMBER='" + member.getPHONE_NUMBER() + "',BIRTH='" + member.getBIRTH() + "',JOIN_DATE='"
					+ member.getJOIN_DATE() + "' where MEMBER_NO='" + MEMBER_NO + "'"; // 쿼리문
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

	public int deleteMember(int MEMBER_NO) {
		int result = 0;
		try {
			String query = "delete from MEMBER where MEMBER_NO =  MEMBER_NO ";
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public void close() {
		try {
			rs.close();
			st.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
