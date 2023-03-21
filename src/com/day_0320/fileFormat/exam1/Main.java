package com.day_0320.fileFormat.exam1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws IOException {
		Reader r = new FileReader("gradle.properties");
		Properties prop = new Properties();
		prop.load(r);

		String str = prop.getProperty("android.useAndroidX");
		System.out.println(str);
		r.close();
	}

}
