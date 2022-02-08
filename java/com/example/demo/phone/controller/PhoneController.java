package com.example.demo.phone.controller;

import com.example.demo.phone.service.PhonServiceimpl;
import com.example.demo.phone.service.PhoneService;

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
        String menu = "0.Exit 1.Phone 2.CelPhone 3.IPhone 4.GalPhone";
        while (true){
            System.out.println(menu);
            switch (scanner.next()){
                case "0" :
                    System.out.println("Exit");return;
                case "1" :
                    service.usePhone(scanner);
                    System.out.println("전화");break;

                case "2" :
                service.useCelPhone(scanner);
                    System.out.println("집전화");break;

                case "3" :
                service.useIPhone(scanner);
                    System.out.println("아이폰");break;
                case "4" :
                service.useGalPhone(scanner);
                    System.out.println("갤럭시");break;
                default:
                    System.out.println("Wrong Number");break;

            }
        }
    }
}
