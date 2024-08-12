package com.example.demo3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo3.BookMapper;


@Controller
public class BookController {

    @Autowired
    BookMapper mapper;
    @GetMapping("/")
    public String getMethodName(Model model) {
        // 데이터베이스로부터 데이터를 조회
        String date = mapper.selectDate();
        // 화면에 출력하기 위해 모델객체에 저장
        model.addAttribute("date", date);
        // 화면이름을 반환
        return "hello";
    }
    

}
