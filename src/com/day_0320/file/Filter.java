package com.day_0320.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;

public class Filter {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, IOException {
		// 파일 출력 스트림 생성
		FileOutputStream fos = new FileOutputStream("data.txt");
		// 암호화 스트림 연결
		Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
		CipherOutputStream cos = new CipherOutputStream(fos, c);

		// 암호화하여 파일에 쓰기
		cos.write(65);
	}

}
