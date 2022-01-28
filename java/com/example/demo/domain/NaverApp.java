package com.example.demo.domain;

/**
 * packageName: com.example.demo.Naver
 * fileName : NaverApp
 * author   : 권혜민
 * date     : 2022-01-25
 * desc     :
 * variable :   [클래스변수]  NAVER_APP
 *              [인스턴스변수] id,pw
 *              [파라미터]    id,pw
 *              [로컬변수]    res
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-25    권혜민   최초 생성
 */
public class NaverApp {
    static String NAVER_APP = "NAVER";

    private String id;
    private String pw;

    public String naver(String id, String pw){

        this.id = id;
        this.pw = pw;

         String res = String.format("%s : 로그인되었습니다",id,pw);
         return res;


    }




}
