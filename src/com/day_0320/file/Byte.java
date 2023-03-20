package com.day_0320.file;

import java.io.ByteArrayOutputStream;

public class Byte {

	public static void main(String[] args) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(65);
		baos.write(66);
		byte[] data = baos.toByteArray();
		System.out.println(data);
	}

}
