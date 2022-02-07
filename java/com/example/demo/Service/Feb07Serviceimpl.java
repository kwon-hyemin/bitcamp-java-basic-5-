package com.example.demo.Service;

/**
 * packageName: com.example.demo.Service
 * fileName : Feb07Serviceimpl
 * author   : 권혜민
 * date     : 2022-02-07
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-07    권혜민   최초 생성
 */
public class Feb07Serviceimpl implements Feb07Service{


    @Override
    public void feb07() {
        int dice  = (int)(Math.random()*6)+1;
        // int dice 는 int random 한 값을 1~6 까지
        int dice1  = (int)(Math.random()*6)+1;
        System.out.println("첫번째 주사위 숫자 : "+ dice+ "\n두번째 주사위 숫자 : "  + dice1);
        int res = dice + dice1;
        System.out.println("주사위 두개를 더한값 : " + res);

    }
}
