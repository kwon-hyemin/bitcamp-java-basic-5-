package com.example.demo.domain;

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

    private String name;
    private double tall;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}


