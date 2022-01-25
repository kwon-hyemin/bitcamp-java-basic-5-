package com.example.demo.Phon;

/**
 * packageName: com.example.demo.Phon
 * fileName : PhonApp
 * author   : 권혜민
 * date     : 2022-01-25
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-25    권혜민   최초 생성
 */
public class PhonApp {

    static String PHON_APP = "TIME";

    private String time;

    public String phon(String time){

        this.time = time;

        String res = String.format("%s 시간이 설정되었습니다", time);

        return res;



    }


}
