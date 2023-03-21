package com.day_0320.fileFormat.exam2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// 총무부 리더 ‘홍길동(41세)’의 인스턴스를 생성하고 직렬화하여 company.dat 파일에 쓰는 프로그램을 작성하시오.

		Department affair = new Department("총무부", new Employee("홍길동", 41));

		// 총무부리더 직렬화하여 저장
		FileOutputStream fos = new FileOutputStream("company.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(affair);
		;
		oos.flush();
		oos.close();

		// 총무부리더 복원
		FileInputStream fis = new FileInputStream("company.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Department department = (Department) ois.readObject();
		ois.close();

	}

}
