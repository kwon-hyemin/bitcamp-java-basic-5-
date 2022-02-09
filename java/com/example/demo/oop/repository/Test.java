package com.example.demo.oop.repository;

import java.util.Scanner;

/**
 * packageName: com.example.demo.phone.repository
 * fileName : Test
 * author   : 권혜민
 * date     : 2022-02-09
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-09    권혜민   최초 생성
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        while (true){
            System.out.println("0 1 2 3 4 5 6 7");
            switch (scanner.next()){
                case "1" :
                    System.out.println("종료");
                    return;
                case "2" :
                    System.out.println("파워킴");

                    break;
                case "3" :
                    System.out.println("파워끔");

                    break;
                case "4" :
                    System.out.println("벨울림");

                    break;
                case "5" :
                    System.out.println("자기 - 메세지");
                case "6" :
                    System.out.println("상대방 - 메세지");
                    break;
                case "7" :
                    System.out.println("전화를 끊습니다");break;
            }
        }
    }

}
