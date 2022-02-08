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
        SortService sortService =new SortServiceimpl();
        StackService stackService = new StackServiceimpl();
        while (true){
            System.out.println("[담당] 0. 종료 1. 권혜민 2. 서성민 3. 조현국 4. 김한슬 5. 김진영");
            switch (scanner.next()){
                case "0" :
                    System.out.println("Exit");return;
                case "1" :
                    sortService.kNumber(scanner);
                    sortService.bestNumber(scanner);
                    sortService.hIndex(scanner);
                    stackService.fdevel(scanner);
                    stackService.stock(scanner);
                    stackService.truck(scanner);
                    stackService.printer(scanner);
                    break;
                case "2" : break;
                case "3" : break;
                case "4" : break;
                case "5" : break;


            }
        }

    }
}
