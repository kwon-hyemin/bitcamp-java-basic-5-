package com.example.demo.Controller;

import com.example.demo.domain.GradeDTO;

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
public class TeamController {
    public static void main(String[] args) {
        String[] arr = {"권혜민", "조현국", "김진영", "김한슬", "서성민",
               "정렬", "해시", "힙", "완전탐색", "DP",
                "스택", "깊이우선탐색", "그래프", "탐욕법", "이중탐색",
                "큐", "너비우선탐색", "", "", ""};
        String s = "";
        for(int i = 2; i < arr.length; i+=5){
            if(i%5==0){s += "\n";}
                s += i + " : " + arr[i] + "\n";
        }
        System.out.println(s);
        System.out.println("팀장이 맡은 과제만 출력하세요");
        s = "";
        String l = "김진영";
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(l)){
                for(int a = i; a < 17; a +=5){
                s += arr[a]+" ";}
            }
        }
        System.out.println(s);
        s = "";
        String m = "정렬";
        System.out.println("큐를 담당한 사람을 출력하세요. 예) 큐담당자 : 권혜민" );
        for(int i = 0; i < arr.length; i++){
            if (arr[i].equals(m)) {
                System.out.println(m+ "담당자 : " + arr[i%5]);
            }
        }
        // 5 10 15 -> 0
        // 6 11 16 -> 1
        // 7 12 17 -> 2
        // 8 13 18 -> 3
        // 9 14 19 -> 4
        System.out.println(s);
        int count = 0;
        System.out.println("팀원별 과제 수를 출력하세요 예) 권혜민(3개) 조현국(3개) 김진영(2개) 김한슬(2개)");
        String countManager = "";
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int[] intArr = new int[5];
        for(int i = 0; i < 17; i++){
            if(arr[i].equals(arr[i])){


            }

        }


        System.out.println(countManager);
    }
}
