package com.example.demo.febquiz.service;

/**
 * packageName: com.example.demo.febquiz.service
 * fileName : Feb10quizService
 * author   : 권혜민
 * date     : 2022-02-10
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-10    권혜민   최초 생성
 */
public class Feb10quizServiceimpl implements Feb10quizSrvice {
    @Override
    public void bubbleSort(int[]arr) {
// 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
        for(int i = 0; i < arr.length; i++) {

            for(int j = 0 ; j < arr.length - i - 1 ; j++) {

                if(arr[j] > arr[j+1]) {

                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                }
            }
        }

        print(arr);
    }
    @Override
    public void insertionSort(int[]arr) {
// 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
        for(int i = 1; i < arr.length; i++) {
            // 타겟 넘버
            int target = arr[i];

            int j = i - 1;

            // 타겟이 이전 원소보다 크기 전 까지 반복
            while(j >= 0 && target < arr[j]) {
                arr[j + 1] = arr[j];   // 이전 원소를 한 칸씩 뒤로 미룬다.
                j--;
            }

            /*
             * 위 반복문에서 탈출 하는 경우 앞의 원소가 타겟보다 작다는 의미이므로
             * 타겟 원소는 j번째 원소 뒤에 와야한다.
             * 그러므로 타겟은 j + 1 에 위치하게 된다.
             */
            arr[j + 1] = target;
        }

        print(arr);

    }

    @Override
    public void selectionSort(int[]arr) {
// 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
        for(int i = 0; i < arr.length - 1; i++) {
            int min_index = i;

            // 최솟값을 갖고있는 인덱스 찾기
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            // i번째 값과 찾은 최솟값을 서로 교환
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        print(arr);
    }
    @Override
    public void quickSort(int[] arr, int start, int end) {

        int part = partition(arr, start, end);

        if (start < part - 1) {
            quickSort(arr, start, part - 1);
        }

        if (end > part) {
            quickSort(arr, part, end);
        }
    }

    private static int partition(int[] arr,int start,int end) {
        int pivot=arr[(start+end)/2];
        while(start<=end) {

            while(arr[start]<pivot) start++;
            while(arr[end]>pivot) end--;

            if(start<=end) {
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        return start;
    }

    private static void swap(int[] arr,int start,int end) {
        int tmp=arr[start];
        arr[start]=arr[end];
        arr[end]=tmp;
        return;

    }




    @Override
    public void mergeSort() {

    }

    @Override
    public void magicSquare() {

    }

    @Override
    public void zigzag() {

    }

    @Override
    public void rectangleStarPrint() {

    }

    @Override
    public void triangleStarPrint() {

    }


    @Override
    public void print(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

}
