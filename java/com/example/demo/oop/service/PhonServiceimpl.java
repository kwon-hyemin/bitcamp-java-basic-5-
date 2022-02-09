package com.example.demo.oop.service;

import com.example.demo.oop.domain.CelPhone;
import com.example.demo.oop.domain.GalPhone;
import com.example.demo.oop.domain.IPhone;
import com.example.demo.oop.domain.Phone;

/**
 * packageName: com.example.demo.Service
 * fileName : PhonServiceimpl
 * author   : 권혜민
 * date     : 2022-02-08
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-08    권혜민   최초 생성
 */
public class PhonServiceimpl implements PhoneService {


    @Override
    public void usePhone(Phone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useCelPhone(CelPhone phone) {
        System.out.println(phone.toString());

    }

    @Override
    public void useIPhone(IPhone phone) {
        System.out.println(phone.toString());

    }

    @Override
    public void useGalPhone(GalPhone phone) {
        System.out.println(phone.toString());

    }
}
