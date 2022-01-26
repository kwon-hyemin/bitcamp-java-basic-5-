package com.example.demo.Login;

/**
 * packageName: com.example.demo.Login
 * fileName : LoginApp
 * author   : 권혜민
 * date     : 2022-01-26
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-26    권혜민   최초 생성
 */
public class LoginApp {
    public static String LOGIN_TITLE = "로그인앱";

    String id;
    String pw;
    String name;
    static String PASSWORD = "abc";


    public  String login(String id,String pw,String name){

        this.id = id;
        this.pw = pw;
        this.name = name;

        String res = "";

        /*if(pw.equals(PASSWORD)){
            res = String.format("%s 님의 비번 %s 가 맞습니다. 로그인 성공",this.name,this.pw);
        } else {
            res = String.format("%s 의 ID는 맞고,%s 비번이 틀립니다. 로그인 실패",this.id,this.pw);
        }*/

        switch (pw){
            case "abc" : res =  String.format("%s 님의 비번 %s 가 맞습니다. 로그인 성공",this.name,this.pw);break;
            default : res = String.format("%s 의 ID는 맞고,%s 비번이 틀립니다. 로그인 실패",this.id,this.pw);break;

        }


        return res;


    }



}
