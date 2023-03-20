package com.day_0320.file.exam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {

		try {
			FileInputStream fis = new FileInputStream("data.txt");
			FileOutputStream fos = new FileOutputStream("copy_data.txt");

			byte[] buffer = new byte[1024];

			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			int bytesRead = bis.read(buffer);
			while ((bytesRead = bis.read(buffer)) != -1) // EOF
			{
				bos.write(buffer, 0, bytesRead);

			}
			fis.close();
			bis.close();
			bos.close();
			fis.close();


		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}

}
