package com.example.demo.Service;

import com.example.demo.domain.GradeDTO;

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
public class GradeService {
    public static String grade(GradeDTO grade){
        System.out.println("GradeService 에 들어옴");


        return  String.format(

                " * ########## %s ########\n" +
                        " * 이름: %s\n" +
                        " * > 국어: %d\n" +
                        " * > 영어: %d점\n" +
                        " * > 수학: %d점\n" +
                        " * 총점: %d점\n" +
                        " * 평균(정수): %d점\n" +
                        " * 합격여부: %s\n" +
                        " * #######################", grade.GRADE_APP, grade.getName(),grade.getKor(),
                grade.getEng(),grade.getMath(),grade.getTotal(),grade.getAvg(),grade.getPass());

        }

    }
