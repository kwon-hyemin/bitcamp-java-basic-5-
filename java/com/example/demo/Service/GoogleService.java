package com.example.demo.Service;

import com.example.demo.domain.GoogleDTO;

/**
 * packageName: com.example.demo.Google
 * fileName : GoogleDemo
 * author   : 권혜민
 * date     : 2022-01-25
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-01-25    권혜민   최초 생성
 */
public class GoogleService {
    public String execute(GoogleDTO google) {

        GoogleDTO googleApp = new GoogleDTO();
        return String.format("%s 입력",google.getUrl());



    }
}
