package com.example.demo.Calc;

import java.util.Scanner;

/**
 * packageName: com.example.demo.Calc
 * fileName : CalcDemo
 * author   : 권혜민
 * date     : 2022-01-25
 * desc     :숫자 2개와 연산자를 받아서 결과를 리턴하는 데모
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-25    권혜민   최초 생성
 */
public class CalcDemo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        CalcApp calcApp = new CalcApp();
        System.out.println (CalcApp.CALC_TITLE);

        int num1 = 0;
        int num2 = 0;
        String opcode = "";

        System.out.println("num1");
        num1 = scanner.nextInt();
        System.out.println("num2");
        num2 = scanner.nextInt();
        System.out.println("opcode");
        opcode = scanner.next();

        String res = calcApp.calc(num1, num2, opcode);
        System.out.println(res);


    }
}
