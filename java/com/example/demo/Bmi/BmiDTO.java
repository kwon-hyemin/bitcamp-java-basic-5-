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
public class BmiDTO {
    public static String BMI_APP = "BMI";

    private String cm;
    private String weight;


    public String getCm(){
        return cm;
    }

    public void setCm (String cm){
        this.cm =  cm;
    }
    public String getWeight(String cm){
        return weight;
    }
    public void setWeight (String weight){
        this.weight = weight;
    }



    }


