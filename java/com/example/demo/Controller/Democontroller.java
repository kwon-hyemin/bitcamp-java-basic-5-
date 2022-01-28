package com.example.demo.Controller;

import com.example.demo.domain.BmiDTO;
import com.example.demo.Service.BmiService;
import com.example.demo.domain.CalcDTO;
import com.example.demo.Service.CalcService;
import com.example.demo.domain.GoogleDTO;
import com.example.demo.Service.GoogleService;
import com.example.demo.domain.LoginDTO;
import com.example.demo.Service.LoginService;
import com.example.demo.domain.GradeDTO;
import com.example.demo.Service.GradeService;

import java.util.Scanner;

/**
 * packageName: com.example.demo.Controller
 * fileName : DemoController
 * author   : 권혜민
 * date     : 2022-01-27
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-27    권혜민   최초 생성
 */
public class Democontroller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CalcService calcService = new CalcService();
        CalcDTO calc = new CalcDTO();

        BmiService bmiService = new BmiService();
        BmiDTO bmi = new BmiDTO();

        GradeService gradeService = new GradeService();
        GradeDTO grade = new GradeDTO();

        LoginService loginService = new LoginService();
        LoginDTO login = new LoginDTO() ;

        GoogleService googleService = new GoogleService();
        GoogleDTO google = new GoogleDTO();

        int i = 0;
        while (i < 3){
            i = i+1;

            System.out.println("메뉴 선택");

            String menu = "0.Exit 1.BMI 2.CALC 3.GOOGLE 4.GRADE 5.LOGIN";

            System.out.println(menu);

            String select = scanner.next();

            String res = "";

            switch (select){
                case "0" :
                    System.out.println("Exit"); return;
                case "1" :
                    System.out.println(BmiDTO.BMI_APP+"\n키 몸무게 입력");
                    bmi.setCm(scanner.next());
                    bmi.setWeight(scanner.next());
                    res = bmiService.getBmi(bmi);

                    break;
                case "2" :
                    System.out.println(CalcDTO.CALC_APP+"\n숫자1 연산자 숫자2 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = calcService.execute(calc);
                    break;
                case "3" :
                    System.out.println(GoogleDTO.GOOGLE_APP+"\n주소 입력");
                    google.setUrl(scanner.next());
                    res = googleService.execute(google);
                    break;
                case "4" :
                    System.out.println(GradeDTO.GRADE_APP+"\n이름 \t국어점수 \t영어점수 \t수학점수");
                    res = gradeService.execute(grade);
                    break;
                case "5" :
                    System.out.println(LoginDTO.LOGIN_TITLE+"\n아이디 패스워드 이름");
                    res = loginService.execute(login);

                break;
                case "6" : res = "6"; break;
                case "7" : res = "7"; break;
                default : res = "WRONG"; break;
            }


            System.out.println(res);


        }
    }
}