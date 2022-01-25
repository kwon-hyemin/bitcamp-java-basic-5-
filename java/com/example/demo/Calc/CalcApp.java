package com.example.demo.Calc;

/**
 * packageName: com.example.demo.Calc
 * fileName : CalcApp
 * author   : 권혜민
 * date     : 2022-01-25
 * desc     :숫자 2개와 연산자를 받아서 결과를 리턴하는 앱
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-25    권혜민   최초 생성
 */
public class CalcApp {
    public static  String CALC_TITLE = "계산기";
    private int num1;
    private int num2;
    private String opcode;



    public String calc(int num1, int num2, String opcode){

        this.num1 = num1;
        this.num2 = num2;
        this.opcode = opcode;

        int res = num1 + num2;

        return String.format("%d, %s, %d = %d", num1, opcode, num2, res);

    }
}
