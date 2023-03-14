package com.day_0310.main;

public class Sting {

	public static void main(String[] args) {
		// 문자열 검색
		String s1 = "Java and JavaScript";
		System.out.println(s1.contains("Java"));
		System.out.println(s1.endsWith("Java"));
		System.out.println(s1.indexOf("Java"));
		System.out.println(s1.lastIndexOf("Java"));

		// 문자열 변환
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.trim());
		System.out.println(s1.replace("and", "or"));

//		String s1 = "HELLO";
//		String s2 = "hello";
//		
//		System.out.println(s1.length());
//		System.out.println(s1.isEmpty());

//		if (s1.equals(s2)) {
//			System.out.println("s1 과 s2는 같다");
//		}if(s1.equalsIgnoreCase(s2)) {
//			System.out.println("s1 과 s2는 다르다");
//		}
//		System.out.println(s1.indexOf('E'));
//		System.out.println(s1);

	}

}
