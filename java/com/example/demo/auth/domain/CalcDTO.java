package com.example.demo.auth.domain;

/**
 * packageName: com.example.demo.auth.domain
 * fileName : CalcDTO
 * author  : 권혜민
 * date   : 2022-02-22
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-02-22     권혜민       최초 생성
 */
public class CalcDTO {
    public final static String CALC_TITLE = "계산기";
    private int num1;
    private String opcode;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public String getOpcode() {
        return opcode;
    }

    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
