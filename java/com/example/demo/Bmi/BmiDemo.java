package com.example.demo.Bmi;

import java.util.Scanner;

/**
 * packageName: com.example.demo.Bmi
 * fileName : BmiDemo
 * author   : 권혜민
 * date     : 2022-01-25
 * desc     :

 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-25    권혜민   최초 생성
 */
public class BmiDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiApp bmiApp = new BmiApp();


        String cm     = "";
        String weight = "";

        System.out.println("cm");
        cm = scanner.next();
        System.out.println("weight");
        weight = scanner.next();

        String res = bmiApp.bmi(cm,weight);
        System.out.println(res);





    }
}
