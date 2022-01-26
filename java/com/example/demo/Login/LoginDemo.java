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
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LoginApp loginApp = new LoginApp();

        System.out.println(LoginApp.LOGIN_TITLE);

        String id = "";
        String pw = "";
        String name = "";

        System.out.println("id");
        id = scanner.next();
        System.out.println("pw");
        pw = scanner.next();
        System.out.println("name");
        name = scanner.next();

        String res = loginApp.login(id, pw, name);
        System.out.println(res);



    }

}
