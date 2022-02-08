package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.Service
 * fileName : Feb07
 * author   : 권혜민
 * date     : 2022-02-08
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-08    권혜민   최초 생성
 */
public class Feb07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dice = 0;
        int dice1 = 0;
        while (true){
            System.out.println("0. Exit 1. 주사위 굴리기");
            String input1 = scanner.next();
            switch (input1){
                case "0" : return;
                case "1" :
                    dice = (int)(Math.random()*6)+1;
                    dice1 = (int)(Math.random()*6)+1; break;
                default: break;

            }
            System.out.println(String.format("당신이 던진주사위 : %d 컴퓨터가 던진 주사위 : %d, %s",dice,dice1, dice>dice1 ? "당신이 이겼습니다!" : "당신이 졌습니다!" ));
        }



    }
}
