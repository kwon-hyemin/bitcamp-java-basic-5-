package com.example.demo.auth.service;

import com.example.demo.auth.domain.*;

/**
 * packageName: com.example.demo.auth.service
 * fileName : MemberService
 * author  : 권혜민
 * date   : 2022-02-22
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-02-22     권혜민       최초 생성
 */
public interface MemberService {
    String getBmi(BmiDTO bmi);

    String bmi (BmiDTO bmi);
    String calc (CalcDTO calc);
    String google (GoogleDTO google);

    String search(GoogleDTO google);

    String grade (GradeDTO grade);
    String login (GoogleDTO login);
}
