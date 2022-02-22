package com.example.demo.auth.domain;

/**
 * packageName: com.example.demo.auth.domain
 * fileName : UserDTO
 * author  : 권혜민
 * date   : 2022-02-22
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-02-22     권혜민       최초 생성
 */
public class UserDTO {
    public static String LOGIN_TITLE = "로그인앱";
    private final static UserDTO userDTO = new UserDTO();
    public static UserDTO getInstance(){return userDTO;}

    private String id;
    private String pw;
    private String name;
    public static String PASSWORD = "abc";

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
        this.name = name;
    }
}
