package com.example.demo.Service;

import com.example.demo.domain.PhonApp;

import java.util.Scanner;

/**
 * packageName: com.example.demo.Phon
 * fileName : PhonDemo
 * author   : 권혜민
 * date     : 2022-01-25
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-25    권혜민   최초 생성
 */
public class PhonDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PhonApp phonApp = new PhonApp();

        String time = "";

        System.out.println("time");
        time = scanner.next();

        String res = phonApp.phon(time);
        System.out.println(res);
    }
}
