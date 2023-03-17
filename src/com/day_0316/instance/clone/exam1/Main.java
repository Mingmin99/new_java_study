package com.day_0316.instance.clone.exam1;

import java.awt.geom.IllegalPathStateException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws ParseException {

		List<Book> listBooks = new ArrayList<>();
		SimpleDateFormat format = new SimpleDateFormat("yyy/mm/dd");

		listBooks.add(new Book("오준석의 생존코딩", format.parse("2022/10/24"), "한빛미디어 "));
		listBooks.add(new Book("오준석의 안드로이드 생존코딩", format.parse("2020/9/24"), "한빛미디어 "));
		listBooks.add(new Book("자바의 정석 ", format.parse("2019/07/24"), "남궁성 "));
		Book book1 = new Book("신데렐라 ", format.parse("2020/01/01"), "동화 ");
		Book book2 = new Book("콩쥐팥쥐 ", format.parse("2021/04/01"), "전래동화  ");
		Book book3 = new Book("그리스로마 신", format.parse("2018/01/01"), "신화 ");
//제목 출간일 같은지 비교
		if (book1.equals(book3)) {
			System.out.println("같다 ");
		} else {
			System.out.println("다르다 ");
		}
//collection
//		Collections.sort(listBooks);
		System.out.println(listBooks);
		// 복제
		System.out.println(book1);

		System.out.println(book1.Clone());
	}

}
