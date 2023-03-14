package com.day_0308;

public class Example4_2 {

	public static void main(String[] args) {
//		3개의 계좌 잔액 “121902”, “8302”, “55100” 이 담겨 있는 int 형 배열 moneyList 를 선언하시오
		int[] moneyList = { 121902, 830, 55100 };
//		그 배열의 요소를 1개씩 for 문으로 꺼내서 화면에 표시하시오
		for (int i = 0; i < 3; i++) {
			System.out.println(moneyList[i]);
		}
//		같은 배열 요소를 foreach 문으로 1개씩 꺼내서 화면에 표시하시오
		for (int value : moneyList) {
			System.out.println(value);
		}

	}

}
