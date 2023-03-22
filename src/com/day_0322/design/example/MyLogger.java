package com.day_0322.design.example;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyLogger {

	private static MyLogger instance;
    private static BufferedWriter writer;

    private MyLogger() {} 

    public static MyLogger getInstance() {
        if (instance == null) {
            instance = new MyLogger();
            try {
                writer = new BufferedWriter(new FileWriter("dummylog.txt"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return instance;
    }

    public void log(String content) {
        try {
            writer.write(content);
            writer.newLine();
            System.out.println("작성 완료");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("dummylog.txt");
        MyLogger logger1 = MyLogger.getInstance();
        logger1.log("first");
        MyLogger logger2 = MyLogger.getInstance();
        logger2.log("second");

    }      
}