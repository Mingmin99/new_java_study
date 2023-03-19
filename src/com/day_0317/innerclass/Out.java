package com.day_0317.innerclass;

public class Out {

	void show() {
		System.out.println("외부클래스");
		
		class In {
			void show2() {
				System.out.println("내가 모르는 엄청난 공식 ");
			}
		}
		In in = new In();
		in.show2();
	}

	

}
