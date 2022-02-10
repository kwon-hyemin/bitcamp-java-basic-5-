package com.example.demo.oop.domain;

import com.example.demo.oop2.student.domain.CalcDTO;

/**
 * packageName: com.example.demo.phone.domain
 * fileName : IPhone
 * author   : 권혜민
 * date     : 2022-02-09
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-09    권혜민   최초 생성
 *
 * 아이폰은 Celphone 에서 검색 (search) 속성이 추가된다
 * 잡스는 아이폰을 휴대폰으로 불리는 것을 거부했다 . 그래서 KIND 는 아이폰이다.
 */
public class IPhone extends CalcDTO {
    public final static String KIND = "아이폰";

    public IPhone(String company){
        super(KIND,company,"이동중");
    }
    private String search;

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return String.format("[%s]에서 만든 %s 을 사용해서 %s중에 %s 를 검색한다",super.getCompany(),KIND
        ,super.getMove(),search);
    }
}
