package com.day_0320.file;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Stream {

	public static void main(String[] args) throws IOException {
		String a = "Hello World";
		Reader reader = new StringReader(a);
		char ch1 = (char) reader.read();
		char ch2 = (char) reader.read();
		System.out.println(ch1);
	}

}
