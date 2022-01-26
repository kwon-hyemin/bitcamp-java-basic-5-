package com.example.demo.grade;/**
* packageName: com.example.demo.grade
* fileName : GradeApp
* author   : 권혜민
* date     : 2022-01-26
* desc     :
 * /* 사용자로부터
 * 이름 [          ]
 * 국어 [          ]
 * 영어 [          ]
 * 수학 [          ]
 * 을 차례대로 입력 받아서
 * ########## 성적표 ########
 * 이름: 홍길동
 * > 국어: 80점
 * > 영어: 79점
 * > 수학: 80점
 * 총점: 239점
 * 평균(정수): 79점
 * 합격여부: 합격(불합격)
 * #######################
 * 출력되는 프로그램을 작성
 * 단, 합격 / 불합격 기준은
 * 평균 60점 이상이면 합격
* ================================
*  DATE      AUTHOR     NOTE
* ================================
*  2022-01-26    권혜민   최초 생성
*/


public class GradeApp {

    static String GRADE_TITLE = "성적표";

    private String name = "";
    private int kor = 0;
    private int eng = 0;
    private int math = 0;
    private int total = 0;
    private int avg = 0;
    private String pass = "";


    String res = "";
    public String grade(String name, int kor, int math,int avg, int total){
        this.avg = avg;
        this.name = name;
        this.kor = kor;
        this.math = math;
        this.total = total;




        pass = (avg >= 60) ? "합격" : "불합격";


        return pass;



    }



}
