package com.example.demo.Google;

import java.util.Scanner;

/**
 * packageName: com.example.demo.Google
 * fileName : GoogleDemo
 * author   : 권혜민
 * date     : 2022-01-25
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-25    권혜민   최초 생성
 */
public class GoogleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GoogleApp googleApp = new GoogleApp();
        System.out.println(GoogleApp.GOOGLE_APP);




        System.out.println("google search or URL 입력");
         String url = scanner.next();


        String res = googleApp.google(url);

        System.out.println(res);





    }

}
