package com.day_0320.fileFormat;

import java.util.StringTokenizer;

public class Csv {

	public static void main(String[] args) {
		String str = "홍길동, 한석봉, 신사임당 ";
		
		//콤마 기준으로 자르기
		StringTokenizer st = new StringTokenizer(str,",");
		while(st.hasMoreTokens()) {//다음 토큰이 있으면
		String token = st.nextToken();
		System.out.println(token);
		}

	}

}
