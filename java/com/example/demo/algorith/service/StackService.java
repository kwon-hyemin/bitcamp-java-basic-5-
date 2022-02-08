package com.example.demo.algorith.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.Service
 * fileName : SEtackService
 * author   : 권혜민
 * date     : 2022-02-08
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-08    권혜민   최초 생성
 */
public interface StackService {
    void fdevel(int[] progresses, int[] speeds);
    void printer(int[] priorities, int location);
    void truck(int bridge_length, int weight, int[] truck_weights);
    void stock(int[] prices);


}
