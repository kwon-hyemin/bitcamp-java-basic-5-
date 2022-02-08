package com.example.demo.quiz.service;

import com.example.demo.quiz.service.Feb07Service;
import com.example.demo.quiz.service.Feb07Serviceimpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.Controller
 * fileName : Feb07Controller
 * author   : 권혜민
 * date     : 2022-02-07
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-07    권혜민   최초 생성
 */
public class Feb07Controller {

//    *1. 주사위 dice
//    *2. 가위바위보 rps
//    *3. 입력받은 두 수 사이의 있는 소수 구하기 getPrime
//    *4. 자바로 입력받은 연도가 윤년인지 평년인지 판단하기 LeapYear
//    *5. 임의로 입력받은 숫자 맞추기 numberGolf
public void execute(Scanner scanner) {

    Feb07Service service = new Feb07Serviceimpl();
    String menu = "0. Exit 1. dice 2. rps 3. getPrime 4. leapYear 5. numberGolf";
    while (true){
        System.out.println(menu);
        switch (scanner.next()){
            case "0" :
                System.out.println("종료"); return;
            case "1" :
                System.out.println("주사위");
                service.feb07();
                break;

            case "2" :
                System.out.println("가위바위보");break;

            case "3" :
                System.out.println("입력받은숫자"); break;

            case "4" :
                System.out.println("평년 윤년"); break;

            case "5" :
                System.out.println("임의숫자");break;

        }

    }





 }
}

