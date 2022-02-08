package com.example.demo.student.service;

import com.example.demo.student.domain.*;

/**
 * packageName: com.example.demo.Bmi
 * fileName : BmiDemo
 * author   : 권혜민
 * date     : 2022-01-25
 * desc     :

 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-25    권혜민   최초 생성
 */
public class MemberServiceimpl implements MemberService {
    @Override
    public String bmi(BmiDTO bmi) {
        return null;
    }

    //    /**
//     * BMI = w/ t*t
//     * 고도 비만 : 35 이상
//     * 중(重)도 비만 (2단계 비만) : 30 - 34.9
//     * 경도 비만 (1단계 비만) : 25 - 29.9
//     * 과체중 : 23 - 24.9
//     * 정상 : 18.5 - 22.9
//     * 저체중 : 18.5 미만
//     **/
    @Override
    public String getBmi(BmiDTO param) {
        return String.format("경도");


    }


    @Override
    public String calc(CalcDTO calc) {

        return String.format("%d %s %d = %d", calc.getNum1(), calc.getOpcode(), calc.getNum2(), calc.getNum1() + calc.getNum2());
    }

    @Override
    public String google(GoogleDTO google) {
        return String.format("%s 입력", google.getUrl());
    }

    @Override
    public String grade(GradeDTO grade) {
        return String.format(

                " * ########## %s ########\n" +
                        " * 이름: %s\n" +
                        " * > 국어: %d\n" +
                        " * > 영어: %d점\n" +
                        " * > 수학: %d점\n" +
                        " * 총점: %d점\n" +
                        " * 평균(정수): %d점\n" +
                        " * 합격여부: %s\n" +
                        " * #######################", grade.GRADE_APP, grade.getName(), grade.getKor(),
                grade.getEng(), grade.getMath(), grade.getTotal(), grade.getAvg(), grade.getPass());
    }

    @Override
    public String login(LoginDTO login) {
        return String.format("%s 로그인 성공", login.getId());
    }
}
