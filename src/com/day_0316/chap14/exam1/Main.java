package com.day_0316.chap14.exam1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date currentData = new Date();

		Calendar calendar = Calendar.getInstance();
		int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
		int newDay = currentDay + 100;
		calendar.set(Calendar.DAY_OF_MONTH, newDay);

		Date newDate = calendar.getTime();

		SimpleDateFormat dataFormat = new SimpleDateFormat("yyy/mm/dd ");
		String today = dataFormat.format(newDate);
		String formatDate = dataFormat.format(newDate);
		System.out.println("현재날짜 : " + today);
		System.out.println("100일 뒤 날 : " + formatDate);
	}

}
