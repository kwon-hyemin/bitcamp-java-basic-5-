package com.example.demo.grade;

/**
 * packageName: com.example.demo.grade
 * fileName : GradeApp
 * author   : 권혜민
 * date     : 2022-01-27
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-27    권혜민   최초 생성
 */
public class GradeApp {

    public static String GRADE_APP = "성적표";

    private String name = "";
    private int kor = 0;
    private int eng = 0;
    private int math = 0;
    private int total = 0;
    private int avg = 0;
    private String pass = "";

    public String grade(String name, int kor, int eng, int math){

        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = total;
        this.avg = avg;
        this.pass = pass;

        total = kor+eng+math;
        avg = total/3;
        pass = (avg >= 60) ? "합격" : "불합격";

        String res = String.format(
                " * ########## %s ########\n" +
                        " * 이름: %s\n" +
                        " * > 국어: %d\n" +
                        " * > 영어: %d점\n" +
                        " * > 수학: %d점\n" +
                        " * 총점: %d점\n" +
                        " * 평균(정수): %d점\n" +
                        " * 합격여부: %s\n" +
                        " * #######################", GRADE_APP,name,kor, eng, math, total,avg,pass);
        return res;




    }








}
