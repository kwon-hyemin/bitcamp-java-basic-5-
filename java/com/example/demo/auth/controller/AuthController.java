package com.example.demo.auth.controller;

import com.example.demo.auth.domain.BmiDTO;
import com.example.demo.auth.domain.CalcDTO;
import com.example.demo.auth.domain.GoogleDTO;
import com.example.demo.auth.domain.GradeDTO;
import com.example.demo.auth.service.MemberService;
import com.example.demo.auth.service.MemberServiceimpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.auth.controller
 * fileName : AuthController
 * author  : 권혜민
 * date   : 2022-02-22
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-02-22     권혜민       최초 생성
 */
public class AuthController {
    public void execute(Scanner scanner){
        BmiDTO bmi = new BmiDTO();
        CalcDTO calc = new CalcDTO();
        GoogleDTO google = new GoogleDTO();
        GradeDTO grade = new GradeDTO();
        MemberService service = new MemberServiceimpl();

        while (true){
            System.out.printf("메뉴 \n 0.Exit 1.BMI 2.CALC 3.GOOGLE 4.GRADE 5.LOGIN");
            String res = "";
            switch (scanner.next()){
                case "0" :
                    System.out.println("Exit"); return;
                case "1" :
                    System.out.println(BmiDTO.BMI+"\n 이름 키 몸무게 입력");
                    bmi.setName(scanner.next());
                    bmi.setTall(scanner.nextDouble());
                    bmi.setWeight(scanner.nextDouble());
                    res = service.bmi(bmi);
                    break;
                case "2" :
                    System.out.println(CalcDTO.CALC_TITLE+ "\n 숫자1, 연산자, 숫자2 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = service.calc(calc);
                    break;
                case "3" :
                    System.out.println(GradeDTO.GRADE_TITLE+"\n검색어 입력");
                    google.setWord(scanner.next());
                    res = service.login(google);
                    break;
                case "4" :
                    System.out.println();
                    break;
                case "5" :
                    break;
                default: res = "Wrong" ; break;
            }
            System.out.printf("res");
        }



    }
}
