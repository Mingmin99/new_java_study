package com.day_0309;

public class Example5_3 {

//	public static void main(String[] args) {
//		String address = "메일을 받는 주소";
//		String text = "메일 본문";
//		email(address, text);
//	}
//
//	public static void email(String title, String address, String text) {
//		System.out.println(address + "에 아래의 메일을 송신한다.");
//		System.out.println("제목 : " + title);
//		System.out.println("본문 : " + text);
//
//	}
//
//	public static void email(String address, String text) {
//		System.out.println(address + "에 아래의 메일을 송신한다.\n제목 : 제목없음");
//		System.out.println("본문 : " + text);
//	}

	public static void main(String[] args) {
		email("제목 어쩌구", "alsdud@naver", "내용");
		email("alsdud@naver", "내용");
		System.out.println();

	}
	

	public static void email(String address, String title, String text) {
		System.out.println(address + "에 아래의 메일을 송신한다.");
		System.out.println("제목 : " + title);
		System.out.println("본문 : " + text);

	}

	public static void email(String address, String text) {
		email(address,"제목없음",text);
	}
}