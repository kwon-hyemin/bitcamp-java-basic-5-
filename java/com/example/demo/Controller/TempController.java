package com.example.demo.Controller;

import java.util.Scanner;

/**
 * packageName: com.example.demo.Controller
 * fileName : TempController
 * author   : 권혜민
 * date     : 2022-02-03
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-03    권혜민   최초 생성
 */
public class TempController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] threeNames = new String[5];
        String[] threeSubject = new String[5];
        String[] threeSubject1 = new String[5];
        String[] threeSubject2 = new String[5];

        threeNames[0] = "권혜민";
        threeSubject[0] = "정렬";
        threeSubject1[0] = "스택";
        threeSubject2[0] = "큐";

        threeNames[1] = "조현국";
        threeSubject[1] = "해시";
        threeSubject1[1] = "깊이";
        threeSubject2[1] = "너비";

        threeNames[2] = "서성민";
        threeSubject[2] = "동적";
        threeSubject1[2] = "이분";

        threeNames[3] = "김한슬";
       threeSubject[3] = "완전";
        threeSubject1[3] = "탐욕";

        threeNames[4] = "김진영";
        threeSubject[4] = "힙";
        threeSubject1[4] = "그래프";

        System.out.println("이름 \t과목");
        String threeName  = scanner.next();
        for(int i = 0; i < threeNames.length; i++){
            System.out.println(threeSubject[i]);
            System.out.println(threeSubject1[i]);
            System.out.println(threeSubject2[i]);

            if(threeName.equals(threeNames[i])){
            System.out.println(threeNames[i]+threeSubject[i]+threeSubject1[i]+threeSubject2[i]);
            break;
        }

        }
    }


}




