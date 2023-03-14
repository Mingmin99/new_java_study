package com.day_0306;

public class Example1 {
    public static void main(String[] args) {
        int a = 10 + 20;
        double d = 3.0;

        // 형변환
        int i = (int) 3.2;
        String s = "베스트" + true;
        System.out.println(i);

        // 연산시의 자동형변환
        System.out.println(5.0 / 2.0);
        System.out.println(5.0 / 2);

        int r = new java.util.Random().nextInt(90); // 0 부터 89까지
        System.out.println("랜덤한 수 " + r);


        // 0부터 5까지
        // int o = new java.util.Random().nextInt(11); // 0부터 10까지

        // 5부터 10까지 표현
        int o = new java.util.Random().nextInt(6) + 5;

        // -5에서 5까지
        int m = new java.util.Random().nextInt(11) - 5;

        System.out.println(o);

        System.out.println("-------------------------------------------------");

        // System.out.println("이름을 입력해 주세요");
        // String name = new java.util.Scanner(System.in).nextLine();
        //
        // System.out.println("나이를 입력해 주세요");
        // int age = new java.util.Scanner(System.in).nextInt();
        //
        // System.out.println("반갑습니다. " + age + "살의" + name + "씨");


        // 연습문제 2-2
        // 2.4.5.7

        // 연습문제 2-3

        // 화면에 “점을 보세요" 라고 표시합니다.
        System.out.println("점을 보세요");

        // 화면에 “이름을 입력해 주세요" 라고 표시합니다.
        System.out.println("이름을 입력해 주세요");

        // 키보드로부터 1행의 문자열을 입력 받아, String 형 변수 name 에 넣습니다.
        String name = new java.util.Scanner(System.in).nextLine();

        // 화면에 “나이를 입력 해 주세요" 라고 표시합니다
        System.out.println("나이를 입력해 주세요");

        // 키보드로부터 1행의 문자 입력을 받아, String 형 변수 ageString 에 넣습니다
        String ageString = new java.util.Scanner(System.in).nextLine();

        // 변수 ageString 의 내용을 int 형으로 변환하고, int 형 변수 age 에 대입합니다
        int age = Integer.valueOf(ageString);

        // 0 부터 3 까지의 난수를 생성해, int 형 변수 fortune 에 대입합니다
        // int fortune = new java.util.Random().nextInt(4);

        // fortune 의 수치를 증가연산자로 1 증가시켜, 1 부터 4 까지의 난수로 합니다.
        int fortune = new java.util.Random().nextInt(4);
        fortune++;

        // 화면에 “점꾀가 나왔습니다!” 라고 표시합니다.
        System.out.println("점꾀가 나왔습니다");

        // 화면에 “(나이)살의 (이름)씨, 당신의 운세번호는 (난수) 입니다" 라고 표시합니다.
        // (나이) 에는 변수 age를, (이름) 에는 변수 name 을, 그리고 (난수) 에는 8. 에서 만든 난수의 숫자를 표시합니다.
        System.out.println(age + "살의 " + name + "씨" + ", " + " 당신의 운세번호는 " + fortune + " 입니다.");

        // 화면에 “1:대박 2:중박 3:보통 4:망" 이라고 표시합니다
        System.out.println("1:대박 2:중박 3:보통 4:망");

    }
}
