package com.example.demo.febquiz.controller;

import com.example.demo.febquiz.service.Feb10quizServiceimpl;
import com.example.demo.febquiz.service.Feb10quizSrvice;

import java.util.Scanner;

/**
 * packageName: com.example.demo.febquiz.controller
 * fileName : Feb10quizController
 * author   : 권혜민
 * date     : 2022-02-10
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-10    권혜민   최초 생성
 */
public class Feb10quizController {
    public void execute(){
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[10];
        Feb10quizSrvice service = new Feb10quizServiceimpl();


        while (true){
            System.out.println("0.Exit 1.버블 2.인설트 3.선택 4.퀵 5.마진 6.마법 7.지그제그 8.별 9.삼각별");
            switch (scanner.next()){
                case "0" :
                    System.out.println("종료");return;
                case "1" :
                    for(int i = 0; i < arr.length; i++){
                        arr[i] = (int) (Math.random() * 100);
                    }
                    service.bubbleSort(arr);
                    System.out.println("버블");
                    System.out.println();
                    break;
                case "2" :
                    for(int i = 0; i < arr.length; i++){
                        arr[i] = (int) (Math.random() * 100);
                    }
                    service.insertionSort(arr);
                    System.out.println("인설트");
                    System.out.println();
                    break;
                case "3":
                    for(int i = 0; i < arr.length; i++){
                        arr[i] = (int) (Math.random() * 100);
                    }
                    service.selectionSort(arr);
                    System.out.println();

                    System.out.println("선택");

                    break;
                case "4":
                    for(int i = 0; i < arr.length; i++){
                        arr[i] = (int) (Math.random() * 100);
                    }
                    service.quickSort(arr, 0, arr.length -1); // 퀵 정렬
                    service.print(arr);
                    System.out.println("퀵");
                    break;
                case "5":
                    System.out.println("마진");

                    break;
                case "6":
                    System.out.println("마법");

                    break;
                case "7":
                    System.out.println("지그제그");

                    break;
                case "8":
                    System.out.println("별");

                    break;
                case "9":
                    System.out.println("삼각별");

                    break;

                default:
                    System.out.println("Wrong Number"); break;
            }
        }

    }
}
