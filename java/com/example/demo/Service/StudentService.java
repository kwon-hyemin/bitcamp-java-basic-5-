package com.example.demo.Service;

import com.example.demo.domain.*;

/**
 * packageName: com.example.demo.Service
 * fileName : BmiService
 * author   : 권혜민
 * date     : 2022-02-07
 * desc     :
 * ================================
 * DATE      AUTHOR     NOTE
 * ================================
 * 2022-02-07    권혜민   최초 생성
 */
public interface StudentService {
    String bmi(BmiDTO bmi);

    String getBmi(BmiDTO bmi);

    String calc(CalcDTO calc);
    String google(GoogleDTO google);
    String grade(GradeDTO grade);
    String login(LoginDTO login);


}
