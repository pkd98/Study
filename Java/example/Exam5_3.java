package com.example;

public class Exam5_3 {

    public static void email(String title, String address, String text) {
        System.out.println(address + " 에 아래의 메일을 송신한다.");
        System.out.println("제목 : " + title);
        System.out.println("본문 : " + text);
    }

    public static void email(String address, String text) {
        System.out.println(address + " 에 아래의 메일을 송신한다.");
        System.out.println("제목 : 제목 없음");
        System.out.println("본문 : " + text);
    }
    
    public static void main(String[] args) {
        email("2360340008@kopo.ac.kr", "반가워");
    }
}
