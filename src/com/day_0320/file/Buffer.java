package com.day_0320.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffer {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("data.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while ((line = br.readLine()) != null)
			;

	}

}
