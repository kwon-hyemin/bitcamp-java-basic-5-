package com.example.demo.oop.domain;

/**
 * packageName: com.example.demo.phone.domain
 * fileName : Phone
 * author   : 권혜민
 * date     : 2022-02-09
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-09    권혜민   최초 생성
 */
public class Phone {
    protected String kind;
    protected String company;
    protected String call;
    public Phone(String kind, String company){
        this.kind = kind;
        this.company = company;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    @Override
    public String toString() {
        return "집전화{" +
                "폰종류='" + kind + '\'' +
                ", 제조사='" + company + '\'' +
                ", 통화내역='" + call + '\'' +
                '}';
    }
}
