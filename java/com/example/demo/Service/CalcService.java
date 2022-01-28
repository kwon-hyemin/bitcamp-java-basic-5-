package com.example.demo.Service;

import com.example.demo.domain.CalcDTO;

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
public class CalcService {

    public String execute(CalcDTO calc) {

        int result = 0;
        switch (calc.getOpcode()){
            case "+": result = calc.getNum1() + calc.getNum2();  break;
            case "-": result = calc.getNum1() - calc.getNum2();  break;
            case "*": result = calc.getNum1() * calc.getNum2();  break;
            case "/": result = calc.getNum1() / calc.getNum2();  break;

        }



        return  String.format("%d %s %d = %d",calc.getNum1(),calc.getOpcode(), calc.getNum2(),calc.getNum1()+calc.getNum2());



    }

}
