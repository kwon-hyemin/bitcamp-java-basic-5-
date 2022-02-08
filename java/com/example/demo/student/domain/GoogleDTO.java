package com.example.demo.student.domain;

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
public class GoogleDTO {
    public static String GOOGLE_APP = "Google";

    private String url = "";

    public String getUrl(){
        return url;
    }
    public void setUrl(String url){
        this.url = url;
    }


    }

