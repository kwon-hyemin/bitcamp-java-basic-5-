package com.example.demo.febquiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.febquiz.service
 * fileName : FebquizServiceimpl
 * author   : 권혜민
 * date     : 2022-02-08
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-08    권혜민   최초 생성
 */
public class FebquizServiceimpl implements FebquizService{

    @Override
    public void lotto(Scanner scanner) {

    }

    @Override
    public void baseball(Scanner scanner) {

    }

    @Override
    public void reservation(Scanner scanner) {

    }

    @Override
    public void bank(Scanner scanner) {
        int money;
        int totalmoney = 0;
        while(true) {
            System.out.println("");
            System.out.println("---------------------------");
            System.out.println("1.예금 ㅣ 2.출금 ㅣ 3.잔고 ㅣ 4.종료");
            System.out.println("---------------------------");
            System.out.print("선택하기 :");



            switch(scanner.next()) {
                case "1":
                    System.out.print("예금액 :");
                    money = scanner.nextInt();
                    totalmoney =totalmoney+money;
                    break;

                case "2":
                    System.out.print("출금액 :");
                    money = scanner.nextInt();
                    totalmoney = totalmoney-money;
                    break;

                case "3":
                    System.out.print("잔고액 :");
                    System.out.println(totalmoney);
                    break;

                case "4":
                    System.out.println("프로그램 종료");
                    break;

                default :
                    System.out.println("다시 입력해주세요");
                    continue;

            }
        }

    }

    @Override
    public void multiplication(Scanner scanner) {
        int i, j;

        for (i = 1; i <= 9; i++) {
            for (j = 2; j <= 5; j++) {
                System.out.print("\t"+ j + "*" + i + "=" + i * j  );
            }
            System.out.println();

        }
        System.out.println();
        for(i = 1; i <= 9; i++){
            for (j = 6; j <=9; j++){
                System.out.print("\t"+ j + "*" + i + "=" + i * j );
            }
            System.out.println();
        }


    }
}