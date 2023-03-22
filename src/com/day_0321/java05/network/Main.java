package com.day_0321.java05.network;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class Main {

	public static void main(String[] args) throws IOException {

//		java.net.URL 클래스를 사용하여 다음 주소의 그림 파일을 읽어서 PC에 저장하는 프로그램을 작성하시오.
//		그림 파일 주소 : https://alimipro.com/favicon.ico
//		저장 위치 : 아무데나
//		파일명 : icon.ico
		BufferedInputStream in = new BufferedInputStream(new URL("https://alimipro.com/favicon.ico").openStream());

		FileOutputStream fos = new FileOutputStream("icon.ico");
		{

			byte dataBuffer[] = new byte[1024];
			int byteRead;

			while ((byteRead = in.read(dataBuffer, 0, 1024)) != 1) {
				fos.write(dataBuffer, 0, byteRead);
			}
		}

	}

}
