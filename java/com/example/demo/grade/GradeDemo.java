package com.example.demo.grade;

import java.util.Scanner;

/**
 * packageName: com.example.demo.grade
 * fileName : GradeDemo
 * author   : 권혜민
 * date     : 2022-01-26
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-26    권혜민   최초 생성
 */
public class GradeDemo {
    public static void main(String[] args) {
        GradeApp gradeApp = new GradeApp();
        System.out.println(GradeApp.GRADE_TITLE);
        Scanner scanner = new Scanner(System.in);

         String name = scanner.next();
         int avg = scanner.nextInt();
         int kor = scanner.nextInt();
         int eng = scanner.nextInt();
         int math = scanner.nextInt();
         int total = scanner.nextInt();
         String pass = scanner.next();


        String res = String.format(" * ########## %s ########\n" +
                " * 이름: %s\n" +
                " * > 국어: %d\n" +
                " * > 영어: %d점\n" +
                " * > 수학: %d점\n" +
                " * 총점: %d점\n" +
                " * 평균(정수): %d점\n" +
                " * 합격여부: %d\n" +
                " * #######################",
                GradeApp.GRADE_TITLE, name, kor, eng, math, total,avg,pass);


        System.out.println(res);


    }
}
