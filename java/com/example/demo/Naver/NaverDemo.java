package com.example.demo.Naver;

import java.util.Scanner;

/**
 * packageName: com.example.demo.Naver
 * fileName : NaverDemo
 * author   : 권혜민
 * date     : 2022-01-25
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-25    권혜민   최초 생성
 */
public class NaverDemo {
    public static void main(String[] args) {
        System.out.println("NAVER");
        Scanner scanner = new Scanner(System.in);
        NaverApp naverApp = new NaverApp();

        String id = "";
        String pw = "";

        System.out.println("id");
        id = scanner.next();
        System.out.println("pw");
        pw = scanner.next();

        String res = naverApp.naver(id, pw);

        System.out.println(res);




    }
}
