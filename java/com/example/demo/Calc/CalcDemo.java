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

    public static void main(String[] args) {

        CalcApp calcApp = new CalcApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println(CalcApp.CALC_APP);

        System.out.println("첫번째 숫자");
        int num1 = scanner.nextInt();

        System.out.println("연산자");
        String opcode = scanner.next();

        System.out.println("두번째 숫자");
        int num2 = scanner.nextInt();


        String result = calcApp.calc(num1, opcode, num2);
        System.out.println("연산결과"+result);




    }

}
