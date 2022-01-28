package com.example.demo.Controller;

import java.util.Scanner;

/**
 * packageName: com.example.demo.Controller
 * fileName : DemoController2
 * author   : 권혜민
 * date     : 2022-01-27
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-27    권혜민   최초 생성
 */
public class AlgoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlgoController stack = new AlgoController();
        while (true){
            System.out.println("[MENU] 0. exit\n" +
                    "1. stack\t" +
                    "2. queue\t" +
                    "3. heap\n" +
                    "4. hash\t" +
                    "5. sort\n" +
                    "6. brute force\t" +
                    "7. dfs\t" +
                    "8. bfs\n" +
                    "9. dp\t" +
                    "10. graph\n" +
                    "11. bin search\t" +
                    "12. greedy\n");

            switch (scanner.next()){
                case "0" :  return;
                case "1" :
                    break;
                case "2" :
                     break;
                default:
                    System.out.println("=== 스텍 문제풀이==="); break;


            }
        }
    }


}


