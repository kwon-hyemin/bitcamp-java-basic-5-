package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.*;

import java.util.Scanner;

/**
 * packageName: com.example.demo.Controller
 * fileName : TeamController
 * author   : 권혜민
 * date     : 2022-02-04
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-04    권혜민   최초 생성
 */
public class QuizController {
    public void execute(Scanner scanner) {
        Feb06Controller feb06Controller = new Feb06Controller();
        Feb07Controller feb07Controller = new Feb07Controller();
        Feb08Controller feb08Controller = new Feb08Controller();
        Feb09Controller feb09Controller = new Feb09Controller();
        while (true){
            System.out.println("0. Exit 1)2월 6일 2)2월 7일 3)2월 8일 4)2월 9일");
            switch (scanner.next()){
                case "0" :
                    System.out.println("Exit"); return;
                case "1" :
                    feb06Controller.execute(scanner);
                    System.out.println("2월 6일");break;
                case "2" :
                    feb07Controller.execute(scanner);
                    System.out.println("2월 7일"); break;
                case "3" :
                    feb08Controller.execute(scanner);
                    System.out.println("2월 8일"); break;
                case "4" :
                    feb09Controller.execute(scanner);
                    System.out.println("2월 9일"); break;
                default:
                    System.out.println("Wrong wold");break;
            }
        }

    }


}
