package com.example.demo.Controller;

import com.example.demo.Bmi.BmiDTO;
import com.example.demo.Bmi.BmiService;
import com.example.demo.Calc.CalcApp;
import com.example.demo.Calc.CalcDemo;
import com.example.demo.Google.GoogleApp;
import com.example.demo.Google.GoogleDemo;
import com.example.demo.Login.LoginApp;
import com.example.demo.Login.LoginDemo;
import com.example.demo.grade.GradeApp;
import com.example.demo.grade.GradeDemo;

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
        CalcDemo calcDemo = new CalcDemo();
        BmiService bmiService = new BmiService();
        BmiDTO bmi = new BmiDTO();
        GradeDemo gradeDemo = new GradeDemo();
        LoginDemo loginDemo = new LoginDemo();
        GoogleDemo googleDemo = new GoogleDemo();




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
                    System.out.println(CalcApp.CALC_APP+"\n숫자1 연산자 숫자2 입력");
                    res = calcDemo.execute(scanner.nextInt(), scanner.next(), scanner.nextInt());
                    break;
                case "3" :
                    System.out.println(GoogleApp.GOOGLE_APP+"\n주소 입력");
                    res = googleDemo.execute(scanner.next());
                    break;
                case "4" :
                    System.out.println(GradeApp.GRADE_APP+"\n이름 \t국어점수 \t영어점수 \t수학점수");
                    res = gradeDemo.execute(scanner.next(), scanner.nextInt(),  scanner.nextInt(), scanner.nextInt());
                    break;
                case "5" : res = "LOGIN";
                    System.out.println(LoginApp.LOGIN_TITLE+"\n아이디 패스워드 이름");
                    res = loginDemo.execute(scanner.next(), scanner.next(), scanner.next());

                break;
                case "6" : res = "6"; break;
                case "7" : res = "7"; break;
                default : res = "WRONG"; break;
            }


            System.out.println(res);


        }
    }
}