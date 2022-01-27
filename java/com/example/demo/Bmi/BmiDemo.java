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
    public static String execute(String weight, String cm) {
        BmiApp bmiApp = new BmiApp();
        return bmiApp.bmi(weight,cm);





    }
}
