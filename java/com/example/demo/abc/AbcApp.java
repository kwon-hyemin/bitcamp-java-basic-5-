package com.example.demo.abc;

/**
 * packageName: com.example.demo.abc
 * fileName : AbcApp
 * author   : 권혜민
 * date     : 2022-01-26
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-26    권혜민   최초 생성
 */
public class AbcApp {

    public static String ABC_APP = "성적표";


    private String name = "";
    private int kor = 0;
    private int eng = 0;
    private int math = 0;
    private int total = 0;
    private int avg = 0;
    private String pass = "";


    public String getAbc(String name,int kor ,int eng,int math){


        this.name = name;
        this.kor =kor;
        this.eng = eng;
        this.math = math;
        this.total = total;
        this.avg = avg;
        this.pass = pass;

        total = kor+eng+math;
        avg = (kor+eng+math)/3;
        pass = (avg >= 60) ? "합격" : "불합격";



        String res = String.format(
                ABC_APP, name, kor, eng, math, total,avg,pass);


        return res;
    }



}
