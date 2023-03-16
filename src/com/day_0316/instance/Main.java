package com.day_0316.instance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {

//	public static void main(String[] args) throws Exception {
//		Hero hero = new Hero();
//		Hero hero2 = new Hero();
//		System.out.println(hero.toString());
//		System.out.println(hero.hashCode());
//		
//		System.out.println(hero.equals(hero2));
//		
//	
//	public static void main(String[] args) {
//		List<Student> 장학생명부 = new ArrayList();
//
//		Student 반장 = new Student("이동학");
//		장학생명부.add(반장);
//		System.out.println(장학생명부);
//		
//		반장 = new Student("박경덕");
//		장학생명부.remove(반장);
//		System.out.println(장학생명부);
//	}
//	public static void main(String[] args) {
//		Set<Student> 장학생명부 = new HashSet();
//
//		Student 반장 = new Student("이동학");
//		장학생명부.add(반장);
//		System.out.println(장학생명부);
//		
//		반장 = new Student("박경덕");
//		장학생명부.remove(반장);
//		System.out.println(장학생명부);
//		
//		System.out.println(반장.toString());
//	}
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(0, " 이동학"));
		students.add(new Student(1, " 박경덕"));
		students.add(new Student(2, " 강태근"));
		students.add(new Student(3 , "최유림"));
	}
}
