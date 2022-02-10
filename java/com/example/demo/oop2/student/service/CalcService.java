package com.example.demo.oop2.student.service;

import com.example.demo.oop2.student.domain.CalcDTO;

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

    public String calc(CalcDTO calc) {

        return  String.format("%d %s %d = %d",calc.getNum1(),calc.getOpcode(), calc.getNum2(),calc.getNum1()+calc.getNum2());



    }

}
