package com.day_0309;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();

//		String [] str = new String [2] ;
//		str [] = {"N" , " " , "M"};		
//		System.out.print(N);
//		System.out.println(" " + M);

		if ((N + M) % 2 != 0) {
			System.out.println("YES");

		} else {
			System.out.println("NO");
		}
	}

}
