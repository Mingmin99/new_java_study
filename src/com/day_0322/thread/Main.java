package com.day_0322.thread;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	System.out.println("아무거나 입력");
	Scanner sc = new Scanner(System.in);
	
	PrintingThread thread = new PrintingThread();
	thread.start();
	 
	
	sc.nextLine();

	}

}
