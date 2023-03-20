package com.day_0320.file;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		try (FileWriter fw = new FileWriter("data.txt", true)) {
			fw.write("Hello World");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			System.out.println("예외처리 완료");
		}

//		FileReader fr = new FileReader("data.txt");
//		int ch = fr.read();
//		while (ch != -1) {
//			System.out.println((char) ch);
//			ch = fr.read();
//		}
//		fr.close();
		FileOutputStream fos = new FileOutputStream("save.txt", true);
		fos.write(65);
		fos.flush();
		fos.close();
	}

}
