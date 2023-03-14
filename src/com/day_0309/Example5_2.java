package com.day_0309;

public class Example5_2 {

	public static void main(String[] args) {
		String title = "메일의 제목";
		String address = "메일을 받는 주소";
		String text = "메일 본문";
		email(title, address, text);
	}

	public static void email(String title, String address, String text) {
		System.out.println(title + "에 아래의 메일을 송신한다.");
		System.out.println("제목 : " + address);
		System.out.println("본문 : " + text);

	}
}
