package com.example.demo.grade;

import java.util.Scanner;

/**
 * packageName: com.example.demo.grade
 * fileName : GradeDemo
 * author   : 권혜민
 * date     : 2022-01-27
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-27    권혜민   최초 생성
 */
public class GradeDemo {
    public static void main(String[] args) {

        System.out.println(GradeApp.GRADE_APP);
        Scanner scanner = new Scanner(System.in);
        GradeApp gradeApp = new GradeApp();


        for (int i = 1; i < 3; i++) {

            System.out.println(i + "번 학생 : 이름, 국어,영어,수학");
            String name = scanner.next();
            System.out.println("kor");
            int kor = scanner.nextInt();
            System.out.println("eng");
            int eng = scanner.nextInt();
            System.out.println("math");
            int math = scanner.nextInt();
            System.out.println("total");
            System.out.println("avg");
            System.out.println("pass");
            String res = gradeApp.grade(name, kor, eng, math);
            System.out.println(res);

        }

    }
}