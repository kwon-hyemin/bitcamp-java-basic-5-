package com.example.demo.Login;

import java.util.Scanner;

/**
 * packageName: com.example.demo.Login
 * fileName : LoginDemo
 * author   : 권혜민
 * date     : 2022-01-26
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-26    권혜민   최초 생성
 */
public class LoginDemo {
    public static String execute (String id, String pw, String name) {

        LoginApp loginApp = new LoginApp();
        return  loginApp.login(id,pw,name);



    }

}
