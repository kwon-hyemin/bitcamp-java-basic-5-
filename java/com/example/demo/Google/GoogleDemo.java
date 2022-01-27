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
    public static String  execute(String url) {

        GoogleApp googleApp = new GoogleApp();
        return googleApp.google(url);






    }

}
