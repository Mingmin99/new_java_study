package com.day_0320.chap15;

import java.io.FileWriter;
import java.io.IOException;

public class Example3 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello world");
		} catch (IOException e) {
			System.out.println("에러발생");
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
