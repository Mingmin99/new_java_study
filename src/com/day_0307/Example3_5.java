package com.day_0307;

public class Example3_5 {

    public static void main(String[] args) {
        // 화면에 “[메뉴] 1:검색 2:등록 3:삭제 4:변경 >” 을 표시한다
        System.out.println("[메뉴] 1:검색 2:등록 3:삭제 4:변경 >");
        // 키보드로 숫자를 입력하고, 변수 selected 에 대입한다.
        int selected = new java.util.Scanner(System.in).nextInt();
        // 만약 변수 selected 가 1 이면 “검색합니다", 2이면 “등록합니다", 3이면 “삭제합니다"
        // , 4이면 “변경합니다"를 표시한다
        // if (selected == 1) {
        // System.out.println("검색합니다");
        // } else if (selected == 2) {
        // System.out.println("등록합니다");
        // } else if (selected == 3){
        // System.out.println("삭제합니다");
        // }else if (selected == 4){
        // System.out.println("변경합니다");
        // } else {
        // }
        switch (selected) {
            case 1:
                System.out.println("검색합니다");
                break;
            case 2:
                System.out.println("등록합니다");
                break;
            case 3:
                System.out.println("삭제합니다");
                break;
            case 4:
                System.out.println("변경합니다");
                break;
            default:

        }



        // selected 가 1 부터 4 사이의 값이 아니라면 아무것도 하지 않는다

    }

}
