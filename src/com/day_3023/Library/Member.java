package com.day_3023.Library;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Member implements Crud {
	Scanner sc = new Scanner(System.in);
	private String name;
	private String address;
	private String phone;
	private String birth;
	private String date;

	public Member() {

	}

	public Member(String name, String address, String phone, String birth, String date) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.birth = birth;
		this.date = date;
	}

	public String toString() {
		return name + "," + address + "," + phone + "," + birth;

	}

//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void add() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void revise() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void delete() {
//		// TODO Auto-generated method stub
//
//	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		birth = birth;
	}

	public void createFile() {
		String fileName = "member.txt";
		File file = new File(fileName);
		FileWriter fileWriter;

		try {
			fileWriter = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			System.out.println("이름을 입력하시오");
			String name = sc.nextLine();
			System.out.println("주소를 입력하시오");
			String address = sc.nextLine();
			System.out.println("연락처를 입력하시오");
			String phone = sc.nextLine();
			System.out.println("생일을 입력하시오\n(ex 2023/01/01 형식으로 입력하시오)");
			String birth = sc.nextLine();
			System.out.println("가입날짜를 입력하시오\n(ex 2023/01/01 형식으로 입력하시오)");
			String date = sc.nextLine();
			Member member = new Member(name, address, phone, birth, date);

			// 파일에 멤버 정보 쓰기
			bufferedWriter.write(member.toString());
			bufferedWriter.newLine();
			bufferedWriter.flush();
			// BufferedWriter 객체와 FileWriter 객체 닫기
			bufferedWriter.close();
			fileWriter.close();

			System.out.println("멤버 정보가 파일에 저장되었습니다.");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

	public void showFile() {
		FileReader fr;
		try {
			fr = new FileReader("member.txt");
			BufferedReader br = new BufferedReader(fr);

			String line;
			while ((line = br.readLine()) != null) {
				String[] lines = line.split(",");
				System.out.println(line);
			}
			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void reviseFile() {
		FileReader fr;
		try {
			fr = new FileReader("member.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("temp.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);

			System.out.println("수정할 회원의 이름을 입력하세요");
			String nameToRevise = sc.next();

			String line;
			boolean found = false;

			while ((line = br.readLine()) != null) {
				String[] lines = line.split(",");
				String name = lines[0];

				if (nameToRevise.equals(name)) {
					System.out.println("수정할 주소를 입력하세요");
					String address = sc.next();
					System.out.println("수정할 연락처를 입력하세요");
					String phone = sc.next();
					System.out.println("수정할 생일을 입력하세요");
					String birth = sc.next();
					System.out.println("수정할 가입날짜를 입력하세요");
					String date = sc.next();

					bw.write(name + "," + address + "," + phone + "," + birth + "," + date);
					bw.newLine();
					found = true;
					break;
				}

				else {
					bw.write(line);
					bw.newLine();

				}
			}
			if (found) {
				System.out.println("회원정보가 수정되었습니다");
			} else {

				System.out.println("해당 회원을 찾을 수 없습니다");
			}
			bw.flush();
			br.close();
			fr.close();
			fw.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File memberFile = new File("member.txt");
		File tempFile = new File("temp.txt");
		if (memberFile.delete()) {
			tempFile.renameTo(memberFile);
		}

	}
//				found = true;
//				break;
//			}else {
//				bw.write(line);
//				bw.newLine();
//			}
//		}
//		if (found) {
//			System.out.println("회원정보가 수정되었습니다");
//		} else {
//
//			System.out.println("해당 회원을 찾을 수 없습니다");
//		}
//		bw.flush();
//		br.close();
//		fr.close();
//		fw.close();
//
//	}

	public void deleteFile() {

		FileReader fr;
		try {
			fr = new FileReader("member.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("temp.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);

			System.out.println("삭제할 회원의 이름을 입력하세요");
			String nameToDelete = sc.next();

			String line;
			boolean found = false;

			while ((line = br.readLine()) != null) {
				String[] lines = line.split(",");
				String name = lines[0];

				if (nameToDelete.equals(name)) {

					found = true;
					continue;
				}

				else {
					bw.write(line);
					bw.newLine();

				}
			}
			if (found) {
				System.out.println("회원정보가 삭제되었습니다");
			} else {

				System.out.println("해당 회원을 찾을 수 없습니다");
			}
			br.close();
			fr.close();
			bw.close();
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File memberFile = new File("member.txt");
		File tempFile = new File("temp.txt");

		if (memberFile.delete()) {
			tempFile.renameTo(memberFile);
		}

	}

}
