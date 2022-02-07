package com.example.demo.Service;

import com.example.demo.domain.LoginDTO;

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
public class LoginService {
    public static String login(LoginDTO login) {


        return String.format("%s 로그인 성공",login.getId());



    }

}
