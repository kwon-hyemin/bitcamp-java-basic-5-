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
    public static String execute(String name, int kor, int eng, int math) {

        GradeApp gradeApp = new GradeApp();
        return  gradeApp.grade(name, kor, eng, math);

        }

    }
