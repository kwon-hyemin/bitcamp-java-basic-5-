package com.example.demo.algorith.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.Service
 * fileName : SortService
 * author   : 권혜민
 * date     : 2022-02-08
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-08    권혜민   최초 생성
 */
public interface SortService {
    int[] kNumber(Scanner scanner);
    int[] bestNumber(Scanner scanner);
    int[] hIndex(Scanner scanner);

}
