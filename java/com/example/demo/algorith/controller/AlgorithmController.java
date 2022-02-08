package com.example.demo.algorith.controller;

import com.example.demo.algorith.service.SortService;
import com.example.demo.algorith.service.SortServiceimpl;
import com.example.demo.algorith.service.StackService;
import com.example.demo.algorith.service.StackServiceimpl;

import java.util.Scanner;

/**
* packageName: com.example.demo
* fileName : AlgorithmController
* author   : 권혜민
* date     : 2022-02-08
* desc     :
* ================================
*  DATE      AUTHOR     NOTE
* ================================
*  2022-02-08    권혜민   최초 생성
*/public class AlgorithmController {
    public void excute(Scanner scanner){
       SortService sortService = (SortService) new SortServiceimpl();
        StackService stackService = new StackServiceimpl();

        while (true){
            System.out.println("[담당] 0. 종료 1. 권혜민 2. 서성민 3. 조현국 4. 김한슬 5. 김진영");
            switch (scanner.next()){
                case "0" :
                    System.out.println("Exit");return;
                case "1" :
                    System.out.println("정렬");
                    int [] arry = new int[1];
                    int [][] commands = new int[1][1];
                    int [] number = new int[1];
                    int [] citations = new int[1];
                    sortService.kNumber(arry,commands);
                    sortService.bestNumber(number);
                    sortService.hIndex(citations);
                    System.out.println("스택 큐");
                    int [] progresses = new int[1];
                    int [] speeds = new int[1];
                    int[] priorities =new int[1];
                    int[] truck_weights = new int[1];
                    int[] prices = new  int[1];
                    int location = 0;
                    int bridge_length = 0;
                    int weight = 0;
                    stackService.fdevel(progresses,speeds);
                    stackService.printer(priorities,location);
                    stackService.truck(bridge_length,weight,truck_weights);
                    stackService.stock(prices);
                    break;
                case "2" : break;
                case "3" : break;
                case "4" : break;
                case "5" : break;


            }
        }

    }
}
