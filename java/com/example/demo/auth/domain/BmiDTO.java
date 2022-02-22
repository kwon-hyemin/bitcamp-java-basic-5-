package com.example.demo.auth.domain;

/**
 * packageName: com.example.demo.auth.domain
 * fileName : BmiDTO
 * author  : 권혜민
 * date   : 2022-02-22
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-02-22     권혜민       최초 생성
 */
public class BmiDTO extends CalcDTO{
    public static String BMI = "BMI 구하기";
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
