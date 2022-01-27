package com.example.demo.Calc;

import java.util.Scanner;

/**
 * packageName: com.example.demo.Calc
 * fileName : CalcDemo
 * author   : 권혜민
 * date     : 2022-01-26
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-26    권혜민   최초 생성
 */
public class CalcDemo {

    public String execute(int num1,String opcode,int num2) {

        CalcApp calcApp = new CalcApp();
        return calcApp.calc(num1, opcode, num2);




    }

}
