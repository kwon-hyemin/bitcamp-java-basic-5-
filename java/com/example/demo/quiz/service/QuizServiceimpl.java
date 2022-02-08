package com.example.demo.quiz.service;

import com.example.demo.quiz.service.QuizService;

import java.util.Scanner;

/**
 * packageName: com.example.demo.Service
 * fileName : QuizService
 * author   : 권혜민
 * date     : 2022-02-07
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-07    권혜민   최초 생성
 */
public class QuizServiceimpl implements QuizService {

    @Override
    public void quiz1(String[] arr) {
        System.out.println("Q1 팀별 과제를 출력하세요");
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                s += "\n";
            }
            s += i + " : " + arr[i] + "\t";
        }
        System.out.println(s);

    }

    @Override
    public void quiz2(String[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Q2 팀장이 맡은 과제만 출력하세요. 예)김진영, 힙, 그래프");
        String s = "";
        System.out.println("이름");
        String l = scanner.next();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(l)) {
                for (int a = i; a < 17; a += 5) {
                    s += arr[a] + " ";
                }
            }
        }
        System.out.println(s);

    }

    @Override
    public void quiz3(String[] arr) {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        System.out.println("Q3 큐를 담당한 사람을 출력하세요. 예)큐를 담당한 사람 : 권혜민");
        System.out.println("과목");
        String m = scanner.next();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(m)) {
                System.out.println(m + "담당자 : " + arr[i % 5]);

            }
        }

    }

    @Override
    public void quiz4(String[] arr) {
        System.out.println("Q4. 팀원별 과제 수를 출력하세요 "
                +"예) 권혜민(3개), 조현국(3개), 김진영(2개), 김한슬(2개), 서성민(2개) ");

        String s = "";
        int[] intArr = new int[5];
        int[] resArr = new int[5];
        for(int i = 5; i< arr.length; i++){
            int a = i % 5;
            for(int j = 0; j<5; j++){
                if(a == j){
                    intArr[j]++;
                }
                resArr = intArr;
            }
        }
        for(int i = 0; i< 5; i++){
            System.out.println(arr[i]+"("+resArr[i]+"), ");
        }

    }
}
