package com.day_0317.enumLogIn;

public class Main {

	public static void main(String[] args) {
		int authState = AuthState.UNAUTHENTICATED;

		if (authState == AuthState.AUTHENTICATED) {
			System.out.println("로그인 됨");
		} else if (authState == AuthState.UNAUTHENTICATED) {
			System.out.println("로그아웃 됨");
		} else {
			System.out.println("로그인 중");
		}

	}

}
