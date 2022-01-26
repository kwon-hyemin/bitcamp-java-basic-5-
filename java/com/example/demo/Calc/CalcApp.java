package com.example.demo.Calc;

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
public class CalcApp {

   public static String CALC_APP = "계산기";

   private int num1;
   private String opcode;
   private int num2;


   public String calc(int num1, String opcode, int num2){

       this.num1= num1;
       this.opcode = opcode;
       this.num2 = num2;

       int res = 0;

      //  if(opcode.equals("+")){
       //     res = this.num1 + this.num2;
       // }else
        //if(opcode.equals("-")){
         //   res = this.num1 - this.num2;
        //}else
        //if(opcode.equals("*")){
          //  res = this.num1 * this.num2;
        //}else
        //if(opcode.equals("/")){
          //  res = this.num1 / this.num2;
          //  }

       switch (opcode) {
           case "+": res = num1 + num2;break;
           case "-": res = num1 - num2;break;
           case "*": res = num1 * num2;break;
           case "/": res = num1 / num2;break;
       }



       String result = String.format("%d %s %d = %d", this.num1,this.opcode,this.num2, res);


       return result;


   }
}
