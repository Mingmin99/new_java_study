package com.day_0320.chap15.exam4;

import java.io.IOException;

public class Main {

	public static void main(String[] args)  {
		System.out.println("프로그램 시작");
		try {
			IOException e = new IOException("임의로 IOException 발생시켰습니다");
			throw e;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.exit(1);
		}

	}
}
