package com.example.demo.febquiz.controller;

import com.example.demo.febquiz.service.Feb10quizServiceimpl;
import com.example.demo.febquiz.service.Feb10quizSrvice;

import java.util.Scanner;

/**
 * packageName: com.example.demo.febquiz.controller
 * fileName : Feb10quizController
 * author   : 권혜민
 * date     : 2022-02-10
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-10    권혜민   최초 생성
 */
public class Feb10quizController {
    public void execute(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("0.Exit 1.버블 2.인설트 3.선택 4.퀵 5.마진 6.마법 7.지그제그 8.별 9.삼각별");
            Feb10quizSrvice feb10quizSrvice = new Feb10quizServiceimpl();
            switch (scanner.next()){
                case "0" :
                    System.out.println("종료");return;
                case "1" :
                    System.out.println("버블");
                    feb10quizSrvice.quickSort();
                    break;
                case "2" :
                    System.out.println("인설트");
                    feb10quizSrvice.quickSort();
                    break;
                case "3":
                    System.out.println("선택");
                    feb10quizSrvice.quickSort();
                    break;
                case "4":
                    System.out.println("퀵");
                    feb10quizSrvice.quickSort();
                    break;
                case "5":
                    System.out.println("마진");
                    feb10quizSrvice.quickSort();
                    break;
                case "6":
                    System.out.println("마법");
                    feb10quizSrvice.quickSort();
                    break;
                case "7":
                    System.out.println("지그제그");
                    feb10quizSrvice.quickSort();
                    break;
                case "8":
                    System.out.println("별");
                    feb10quizSrvice.quickSort();
                    break;
                case "9":
                    System.out.println("삼각별");
                    feb10quizSrvice.quickSort();
                    break;

                default:
                    System.out.println("Wrong Number"); break;
            }
        }

    }
}
