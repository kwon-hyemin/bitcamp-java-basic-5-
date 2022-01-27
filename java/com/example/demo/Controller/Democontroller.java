package com.example.demo.Controller;

import com.example.demo.Bmi.BmiApp;
import com.example.demo.Bmi.BmiDemo;
import com.example.demo.Calc.CalcApp;
import com.example.demo.Calc.CalcDemo;
import com.example.demo.Google.GoogleApp;
import com.example.demo.Google.GoogleDemo;
import com.example.demo.Login.LoginApp;
import com.example.demo.Login.LoginDemo;
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
        BmiDemo bmiDemo = new BmiDemo();
        GradeDemo gradeDemo = new GradeDemo();
        LoginDemo loginDemo = new LoginDemo();
        GoogleDemo googleDemo = new GoogleDemo();




        int i = 0;
        while (i < 3){
            i = i+1;

            System.out.println("메뉴 선택");

            String menu = "0.Exit 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";

            System.out.println(menu);

            String select = scanner.next();

            String res = "";

            switch (select){
                case "0" :
                    System.out.println("Exit"); return;
                case "1" :
                    System.out.println(BmiApp.BMI_APP+"\n키 몸무게 입력");
                    System.out.println(bmiDemo.execute(scanner.next(), scanner.next()));
                    break;
                case "2" :
                    System.out.println(CalcApp.CALC_APP+"\n숫자1 연산자 숫자2 입력");
                    System.out.println(calcDemo.execute(scanner.nextInt(), scanner.next(), scanner.nextInt()));
                    break;
                case "3" : res = "GOOGLE";
                    System.out.println(GoogleApp.GOOGLE_APP+"\n주소 입력");
                    System.out.println(googleDemo.execute(scanner.next()));
                    break;
                case "4" : res = "GRADE";
                    System.out.println(CalcApp.CALC_APP+"\n숫자1 연산자 숫자2 입력");
                    calcDemo.execute(scanner.nextInt(), scanner.next(), scanner.nextInt());
                    break;
                case "5" : res = "LOGIN"; break;
                case "6" : res = "6"; break;
                case "7" : res = "7"; break;
                default : res = "WRONG"; break;
            }


            System.out.println(res);


        }
    }
}