  package com.day_0414.LIBRARY;

import java.util.Calendar;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

import java.sql.*;

public class Member{
    private static final String DB_URL = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
    private static final String USERNAME = "scott";
    private static final String PASSWORD = "tiger";
    
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement()) {
            // 회원 조회
            String selectSql = "SELECT * FROM MEMBER";
            ResultSet rs = stmt.executeQuery(selectSql);
            while (rs.next()) {
                int memberNo = rs.getInt("MEMBER_NO");
                String name = rs.getString("NAME");
                String address = rs.getString("ADDRESS");
                String phoneNumber = rs.getString("PHONE_NUMBER");
                Date birth = rs.getDate("BIRTH");
                Date joinDate = rs.getDate("JOIN_DATE");
                
                System.out.println("회원번호: " + memberNo);
                System.out.println("이름: " + name);
                System.out.println("주소: " + address);
                System.out.println("전화번호: " + phoneNumber);
                System.out.println("생년월일: " + birth);
                System.out.println("가입일자: " + joinDate);
                System.out.println();
            }
//            
//            // 회원 등록
//            String insertSql = "INSERT INTO MEMBER (MEMBER_NO, NAME, ADDRESS, PHONE_NUMBER, BIRTH, JOIN_DATE) " +
//                               "VALUES (1, '최유림', '경기도 광명시', '01020271810', TO_DATE('19981223', 'YYYYMMDD'),  TO_DATE('20230414', 'YYYYMMDD'))";
//            int result = stmt.executeUpdate(insertSql);
//            if (result == 1) {
//                System.out.println("회원 등록이 완료되었습니다.");
//            } else {
//                System.out.println("회원 등록에 실패하였습니다.");
//            }
            
            // 회원 수정
//            String updateSql = "UPDATE MEMBER SET ADDRESS = '서울시 강서구' WHERE NAME = '홍길동'";
//            result = stmt.executeUpdate(updateSql);
//            if (result == 1) {
//                System.out.println("회원 정보 수정이 완료되었습니다.");
//            } else {
//                System.out.println("회원 정보 수정에 실패하였습니다.");
//            }
            
            // 회원 삭제
//            String deleteSql = "DELETE FROM MEMBER WHERE NAME = '홍길동'";
//            result = stmt.executeUpdate(deleteSql);
//            if (result == 1) {
//                System.out.println("회원 삭제가 완료되었습니다.");
//            } else {
//                System.out.println("회원 삭제에 실패하였습니다.");
//            }
            
        } catch (SQLException e) {
            System.out.println("DB 연결 실패 혹은 쿼리 실행 오류: " + e.getMessage());
        }
    }
}