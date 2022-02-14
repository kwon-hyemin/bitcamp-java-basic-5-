package com.example.demo.febquiz.service;

/**
 * packageName: com.example.demo.febquiz.service
 * fileName : Feb10quizController
 * author   : 권혜민
 * date     : 2022-02-10
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-10    권혜민   최초 생성
 */
public interface Feb10quizSrvice {


        // 아래 문제들은 모두 스캐너 없이 , Math랜덤으로 처리합니다
        // 1인
        void bubbleSort(int[]arr);
        void insertionSort(int[]arr);
        void selectionSort(int[]arr);
        // 1인

        void quickSort(int[] arr, int i, int i1);
        void mergeSort();
        // 1인
        void magicSquare();
        // 1인
        void zigzag();
        // 1인
        // 좌측90도 직각삼각형 별찍기
        void rectangleStarPrint();
        // 정삼각형 별찍기

        void triangleStarPrint();
        public void print(int[] arr);

}

