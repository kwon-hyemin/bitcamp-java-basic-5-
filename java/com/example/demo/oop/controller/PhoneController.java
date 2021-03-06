package com.example.demo.oop.controller;

import com.example.demo.oop.domain.CelPhone;
import com.example.demo.oop.domain.GalPhone;
import com.example.demo.oop.domain.IPhone;
import com.example.demo.oop.domain.Phone;
import com.example.demo.oop.service.PhonServiceimpl;
import com.example.demo.oop.service.PhoneService;

import java.util.Scanner;

/**
 * packageName: com.example.demo.Controller
 * fileName : PhoneController
 * author   : 권혜민
 * date     : 2022-02-08
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-08    권혜민   최초 생성
 */
public class PhoneController {
    public void execute(Scanner Scanner) {
        Scanner scanner = new Scanner(System.in);

        PhoneService service = new PhonServiceimpl();
        String menu = "0.Exit\n" + "1.은닉화 (Encapsulation)\n" + "2.상속 (Inheritance)\n" + "3.추상화(Abstraction)\n" + "4.다형성 (Polymorphism)\n";
        while (true) {
            System.out.println(menu);
            switch (scanner.next()) {
                case "0":
                    System.out.println("Exit");
                    return;
                case "1":
                    System.out.println("POJO가 은닉화다");
                    break;

                case "2":
                    System.out.println("extends가 상속");

                case "3":
                    System.out.println("추상화");

                    break;
                case "4":
                    System.out.println("다형성");
                case "5" :

                    while (true) {
                        System.out.println("소메뉴 0.exit 1.집전화 2.휴대폰 3.아이폰 4. 갤럭시폰");
                        Phone phone = new Phone("금성전화기","금성전자");
                        CelPhone celPhone = new CelPhone("핸드폰", "이동중에","블랙베리");
                        IPhone iPhone = new IPhone("애플");
                        GalPhone galPhone = new GalPhone("삼성");
                        PhoneService phoneService = new PhonServiceimpl();
                        switch (scanner.next()) {

                            case "0":
                                System.out.println("Exit");
                                return;
                            case "1" :
                                phone.setCall("여보세요?");
                                phoneService.usePhone(phone);
                                break;
                            case "2" :
                                celPhone.setCall("안녕하세요");
                                phoneService.useCelPhone(celPhone);
                                break;
                            case "3" :
                                iPhone.setSearch("뉴스");
                                phoneService.useIPhone(iPhone);
                                break;
                            case "4" :
                                galPhone.setPay("삼성 페이");
                                phoneService.useGalPhone(galPhone);
                                break;

                            case "5" :
                                System.out.println("Wrong Number");
                            default:break;


                        }
                    }
            }
        }
    }
}