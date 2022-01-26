package com.example.demo.abc;

import java.util.Scanner;

/**
 * packageName: com.example.demo.abc
 * fileName : AbcDemo
 * author   : 권혜민
 * date     : 2022-01-26
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-26    권혜민   최초 생성
 */
public class AbcDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbcApp abcApp = new AbcApp();
        System.out.println(AbcApp.ABC_APP);

        System.out.println("name");
        String name =  scanner.next();

        System.out.println("kor");
        int kor = scanner.nextInt();

        System.out.println("eng");
        int eng = scanner.nextInt();

        System.out.println("math");
        int math = scanner.nextInt();

        System.out.println("total");


        System.out.println("avg");


        System.out.println("pass");



        String res = abcApp.getAbc(name, kor, eng, math);
        System.out.println(res);













    }

}
