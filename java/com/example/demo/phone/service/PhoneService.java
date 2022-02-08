package com.example.demo.phone.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.Service
 * fileName : PhoneService
 * author   : 권혜민
 * date     : 2022-02-08
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-08    권혜민   최초 생성
 */
public interface PhoneService{
    void usePhone(Scanner scanner);
    void useCelPhone(Scanner scanner);
    void useIPhone(Scanner scanner);
    void useGalPhone(Scanner scanner);
}
