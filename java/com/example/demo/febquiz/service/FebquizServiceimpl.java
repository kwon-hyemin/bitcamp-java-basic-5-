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

    }

    @Override
    public void multiplication(Scanner scanner) {
            int i, dan;
            for (dan = 2; dan <= 9; dan++) {
                System.out.print("[" + dan + "단]\t");
            }
            System.out.println();
            for (i = 1; i <= 9; i++) {
                for (dan = 2; dan <= 9; dan++) {
                    System.out.print(dan + "*" + i + "=" + i * dan + "\t");
                }
                System.out.println();
            }

    }
}
