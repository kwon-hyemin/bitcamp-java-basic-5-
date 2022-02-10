package com.example.demo.oop2.student.domain;

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
public class UserDTO {
    public static String LOGIN_TITLE = "로그인앱";

    private final static UserDTO userDTO = new UserDTO();
    private UserDTO(){}
    public static UserDTO getInstance(){
        return userDTO;
    }

    String id;
    String pw;
    String name;
    static String PASSWORD = "abc";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

    }


    public String login(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        return id;
    }




        /*if(pw.equals(PASSWORD)){
            res = String.format("%s 님의 비번 %s 가 맞습니다. 로그인 성공",this.name,this.pw);
        } else {
            res = String.format("%s 의 ID는 맞고,%s 비번이 틀립니다. 로그인 실패",this.id,this.pw);
        }*/

       /* switch (pw){
            case "abc" : res =  String.format("%s 님의 비번 %s 가 맞습니다. 로그인 성공",this.name,this.pw);break;
            default : res = String.format("%s 의 ID는 맞고,%s 비번이 틀립니다. 로그인 실패",this.id,this.pw);break;

             */
}



