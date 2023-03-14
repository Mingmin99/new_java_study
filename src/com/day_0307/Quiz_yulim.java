package com.day_0307;

public class Quiz_yulim {

    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        String stname = "Hello ";


        for (int i = 0; i < n; i++) {
            String name = new java.util.Scanner(System.in).nextLine();

            if (i == n - 1) {
                stname += name + ".";
            } else {
                stname += name + ",";
            }
        }
        System.out.println(stname);
    }

}
