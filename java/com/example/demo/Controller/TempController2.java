package com.example.demo.Controller;

/**
 * packageName: com.example.demo.Controller
 * fileName : TempController2
 * author   : 권혜민
 * date     : 2022-02-03
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-03    권혜민   최초 생성
 */
public class TempController2 {
    public static void main(String[] args) {
        String[] twoName = {"권혜민", "조현국", "김진영", "김한슬", "서성민"};
        String[] twoSubjects = {"정렬", "해시", "힙", "완전탐색", "DP",
                "스택", "깊이우선탐색", "그래프", "탐욕법", "이중탐색",
                "큐", "너비우선탐색", "", "", ""};
        for (int i = 0; i < twoName.length; i++) {
            System.out.println(twoName[i]
                    + " : " + twoSubjects[i]
                    + " : " + twoSubjects[i + 5]
                    + " : " + twoSubjects[i + 10]);

        }

    }
}

