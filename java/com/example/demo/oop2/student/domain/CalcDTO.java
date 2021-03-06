package com.example.demo.oop2.student.domain;

import com.example.demo.oop.domain.IPhone;

import java.lang.ref.PhantomReference;

/**
 * packageName: com.example.demo.Calc
 * fileName : CalcApp
 * author   : 권혜민
 * date     : 2022-01-26
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-26    권혜민   최초 생성
 */
public class CalcDTO {

   public static String CALC_APP = "계산기";

   private int num1;
   private String opcode;
   private int num2;
   private String kind;
   private String company;
   private String move;
    public CalcDTO(String kind, String company, String move) {
        this.company =company;
        this.kind = kind;
        this.move = move;
    }


    public  int getNum1(){

       return num1;
   }

    public void setNum1 (int num1){
       this.num1 = num1;
   }
    public String getOpcode(){
       return opcode;
   }
    public void setOpcode(String opcode){
       this.opcode = opcode;
   }
    public int getNum2(){
       return num2;
   }
    public void setNum2(int num2){
        this.num2 = num2;
   }
    protected int getMove() {

        return 0;
    }

    protected int getCompany() {
        return 0;
    }

    public CalcDTO() {

    }
}
