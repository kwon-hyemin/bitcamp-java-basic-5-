package com.example.demo.Controller;

import com.example.demo.Service.QuizService;
import com.example.demo.Service.QuizServiceimpl;

import java.security.Provider;
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
    public static void main(String[] args) {
        String[] arr = {"권혜민", "조현국", "김진영", "김한슬", "서성민",
               "정렬", "해시", "힙", "완전탐색", "DP",
                "스택", "깊이우선탐색", "그래프", "탐욕법", "이중탐색",
                "큐", "너비우선탐색", "", "", ""};
        Scanner scanner = new Scanner(System.in);
        String menu = "0. Exit 1. quiz1 2. quiz2 3. quiz3 4. quiz4";
        System.out.println(menu);
        QuizService service = new QuizServiceimpl();

        while (true){
            switch (scanner.next()){
                case "0" :
                    System.out.println("시스템 종료"); return;
                case "1" :
                   service.quiz1(arr);break;
                case "2" :
                    service.quiz2(arr);break;
                case "3" :
                    service.quiz3(arr);break;
                case "4" :
                    System.out.println();
                    service.quiz4(arr);break;
            }
        }

    }


}
