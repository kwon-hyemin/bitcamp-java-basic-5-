package com.example.demo.Bmi;

/**
 * packageName: com.example.demo.Bmi
 * fileName : BmiApp
 * author   : 권혜민
 * date     : 2022-01-25
 * desc     :
 *  variable :   [클래스변수]  BMI_APP
 *               [인스턴스변수] cm, weight
 *               [파라미터]    cm, weight
 *               [로컬변수]    res
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-25    권혜민   최초 생성
 */
public class BmiApp {
    static String BMI_APP = "BMI";

    private String cm;
    private String weight;

    public String bmi(String cm,String weight){
        this.cm = cm;
        this.weight = weight;

        String res = String.format("%s 정상체중입니다,%s" ,weight,cm);
        return res;


    }

}
