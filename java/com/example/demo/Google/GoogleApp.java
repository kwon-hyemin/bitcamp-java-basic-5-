package com.example.demo.Google;

/**
 * packageName: com.example.demo.Google
 * fileName : GoogleApp
 * author   : 권혜민
 * date     : 2022-01-25
 * desc     :
 * *              [클래스변수]  GOOGLE_APP
 *  *              [인스턴스변수] url
 *  *              [파라미터]   url
 *  *              [로컬변수]   res
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-25    권혜민   최초 생성
 */
public class GoogleApp {
    static String GOOGLE_APP = "Google";

    private String url = "";

    public String google(String url){


        this.url = url;

        String res =  String.format("%s : 검색한 결과", url);
        return res;

    }
}
