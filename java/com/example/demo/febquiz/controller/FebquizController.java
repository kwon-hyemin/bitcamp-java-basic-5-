package com.example.demo.febquiz.controller;

import com.example.demo.febquiz.service.FebquizService;
import com.example.demo.febquiz.service.FebquizServiceimpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.febquiz.controller
 * fileName : FebquizController
 * author   : 권혜민
 * date     : 2022-02-08
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-08    권혜민   최초 생성
 */
public class FebquizController {
    public void execute(Scanner scanner){
        FebquizService service = new FebquizServiceimpl();

        while (true){
            System.out.println("0. Exit 1.로또\n" +
                    "2.야구\n" +
                    "3.예약\n" +
                    "4.은행\n" +
                    "5.구구단");
            switch (scanner.next()){
                case "0":
                    System.out.println("Exit");return;
                case "1" :
                    System.out.println("로또");
                    service.lotto(scanner); break;
                case "2" :
                    System.out.println("야구");
                    service.baseball(scanner);break;
                case "3" :
                    System.out.println("예약");
                    service.reservation(scanner);break;
                case "4" :
                    System.out.println("은행");
                    service.bank(scanner);break;
                case "5" :
                    System.out.println("구구단");
                    service.multiplication(scanner);break;
                default:
                    System.out.println("Wrong Number");break;
            }
        }

    }
}
